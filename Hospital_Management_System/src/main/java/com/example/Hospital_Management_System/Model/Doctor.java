package com.example.Hospital_Management_System.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "doctor")
public class Doctor {


    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id")
    private Employee employee;

    private double charges;

    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    private List<Patient> patients;

    public void addPatient(Patient p)
    {
        p.setDoctor(this);
        patients.add(p); // we are adding patient object 'p' to list of patients

    }

}
