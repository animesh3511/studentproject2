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
@Table(name = "medicines_assigned")
public class MedicineAssigned {

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicineAssignedId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medicine_id")
    private Medicines medicines;

    @Column(name = "prescription")
    private  String prescription;

    @Column(name = "medicine_quantity")
    private int medicineQty;


}
