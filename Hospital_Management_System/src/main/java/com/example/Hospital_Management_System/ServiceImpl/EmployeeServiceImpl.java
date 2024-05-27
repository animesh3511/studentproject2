package com.example.Hospital_Management_System.ServiceImpl;

import com.example.Hospital_Management_System.Model.Employee;
import com.example.Hospital_Management_System.Model.Request.EmployeeRequest;
import com.example.Hospital_Management_System.Repository.employeeRepository;
import com.example.Hospital_Management_System.Service.EmployeeService;
import com.example.Hospital_Management_System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    employeeRepository employeerepository;


    @Override
    public Object saveOrUpdate(EmployeeRequest employeeRequest) {

        if(employeerepository.existsById(employeeRequest.getEmployeeId()))
        {
            Employee employee = employeerepository.findById(employeeRequest.getEmployeeId()).get();
            employee.setEmployeeId(employeeRequest.getEmployeeId());
            employee.setDob(employeeRequest.getDob());
            employee.setHireDate(employeeRequest.getHireDate());
            employee.setSalary(employeeRequest.getSalary());
            employee.setUser(employeeRequest.getUser());
            employee.setDoctor(employeeRequest.getDoctor());

            employeerepository.save(employee);

            return "Employee updated";



        }
        else
        {
            Employee employee = new Employee();
            employee.setEmployeeId(employeeRequest.getEmployeeId());
            employee.setDob(employeeRequest.getDob());
            employee.setHireDate(employeeRequest.getHireDate());
            employee.setSalary(employeeRequest.getSalary());
            employee.setUser(employeeRequest.getUser());
            employee.setDoctor(employeeRequest.getDoctor());

            employeerepository.save(employee);

            return "Emplooyee saved";
        }


    }
}
