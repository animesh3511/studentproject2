package com.example.Hospital_Management_System.Model.Request;

import com.example.Hospital_Management_System.Model.Employee;
import com.example.Hospital_Management_System.Model.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.ParameterizedType;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRequest {

    private Long userId;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private  String role;

    private String cellNo;

    private String securityQuestion;

    private String securityAnswer;

    private Employee employee;

    private Patient patient;

}
