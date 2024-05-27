package com.example.Hospital_Management_System.Model.Request;

import com.example.Hospital_Management_System.Model.Employee;
import com.example.Hospital_Management_System.Model.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DoctorRequest {

    private Long doctorId;

    private Employee employee;

    private double charges;

    private List<Patient> patients;




}
