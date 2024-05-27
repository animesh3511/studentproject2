package com.example.Hospital_Management_System.Model.Request;

import com.example.Hospital_Management_System.Model.Doctor;
import com.example.Hospital_Management_System.Model.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DoctorVisitsRequest {

   private Long doctorVisitsId;

   private Patient patient;

   private Doctor doctor;

   private int visits;

}
