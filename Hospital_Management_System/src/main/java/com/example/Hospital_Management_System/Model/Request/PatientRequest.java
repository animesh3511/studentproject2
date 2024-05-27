package com.example.Hospital_Management_System.Model.Request;

import com.example.Hospital_Management_System.Model.Doctor;
import com.example.Hospital_Management_System.Model.MedicineAssigned;
import com.example.Hospital_Management_System.Model.User;
import com.example.Hospital_Management_System.Model.Ward;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PatientRequest {

    private Long patientId;

    private User user;

    private Ward ward;

    private Doctor doctor;

    private Date dob;

    private Date dateOfAddmission;

    private String bloodGroup;

    private String prescription;

    private int bedAllowed;

    private String paymentStatus;

    private String patientProblem;

    private List<MedicineAssigned> medicines;


}
