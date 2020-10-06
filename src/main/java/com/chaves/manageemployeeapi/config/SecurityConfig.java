package com.chaves.manageemployeeapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;


    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("SELECT p.email, e.password, e.active FROM employee e " +
                        "INNER JOIN person p ON p.id = e.person_id " +
                        "WHERE p.email = ? ")
                .authoritiesByUsernameQuery("SELECT a.email, a.role FROM authorization a " +
                        "WHERE a.email = ?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"/people").hasAnyRole("EMPLOYEE", "MANAGER")
                .antMatchers(HttpMethod.GET,"/sales").hasAnyRole("EMPLOYEE", "MANAGER")
                .antMatchers(HttpMethod.POST,"/sales").hasAnyRole("EMPLOYEE", "MANAGER")
                .antMatchers(HttpMethod.POST,"/employees").hasRole("MANAGER")
                .antMatchers(HttpMethod.PATCH,"/employees").hasRole("MANAGER")
                .antMatchers(HttpMethod.GET,"/employees").hasRole("MANAGER")
                .and()
                .formLogin();
    }
}
