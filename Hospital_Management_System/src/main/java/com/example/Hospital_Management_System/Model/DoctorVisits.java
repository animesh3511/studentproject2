package com.example.Hospital_Management_System.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "doctor_visits")
public class DoctorVisits {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_visit_id")
    private Long doctorVisitsId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @Column(name = "visits")
    private  int visits;
}
