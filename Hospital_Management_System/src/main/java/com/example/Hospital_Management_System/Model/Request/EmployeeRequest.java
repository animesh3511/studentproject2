package com.example.Hospital_Management_System.Model.Request;

import com.example.Hospital_Management_System.Model.Doctor;
import com.example.Hospital_Management_System.Model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeRequest {

    private Long employeeId;

    private double salary;

    private Date dob;

    private Date hireDate;

    private User user;

    private Doctor doctor;

    private Long userId;


}
