package com.example.Hospital_Management_System.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "ward")
public class Ward {

    @Id
   // @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long wardId;

    @Column(name = "types")
    private String types;

    @Column(name = "charges")
    private double charges;

    @Column(name = "available")
    private double avalibility;

    @Column(name = "capacity")
    private double maxCapacity;

    @OneToMany(mappedBy = "ward",cascade = CascadeType.ALL)
    private List<Patient> patients;

    public void addPatient(Patient p)
    {
        p.setWard(this);
        patients.add(p);

    }

}
