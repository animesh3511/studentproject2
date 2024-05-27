package com.example.Hospital_Management_System.Repository;

import com.example.Hospital_Management_System.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<Employee,Long> {

}
