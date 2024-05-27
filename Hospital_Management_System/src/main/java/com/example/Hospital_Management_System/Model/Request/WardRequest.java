package com.example.Hospital_Management_System.Model.Request;


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
public class WardRequest {

    private Long wardId;

    private String types;

    private double charges;

    private double availibility;

    private double maxCapacity;

    private List<Patient> patients;



}
