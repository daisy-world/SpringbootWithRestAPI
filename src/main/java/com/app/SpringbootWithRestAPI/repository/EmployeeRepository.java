package com.app.SpringbootWithRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.SpringbootWithRestAPI.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
