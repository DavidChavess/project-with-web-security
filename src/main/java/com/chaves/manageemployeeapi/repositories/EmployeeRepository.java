package com.chaves.manageemployeeapi.repositories;

import com.chaves.manageemployeeapi.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
