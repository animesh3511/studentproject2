package com.example.Hospital_Management_System.Model.Request;

import com.example.Hospital_Management_System.Model.Medicines;
import com.example.Hospital_Management_System.Model.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MedicineAssignedRequest {

    private Long medicineAssignedId;

    private Patient patient;

    private Medicines medicines;

    private String prescription;

    private int medicineQty;





}
