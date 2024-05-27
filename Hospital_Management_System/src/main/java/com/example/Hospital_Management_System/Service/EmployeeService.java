package com.example.Hospital_Management_System.Service;


import com.example.Hospital_Management_System.Model.Request.EmployeeRequest;

public interface EmployeeService {
    Object saveOrUpdate(EmployeeRequest employeeRequest);
}
