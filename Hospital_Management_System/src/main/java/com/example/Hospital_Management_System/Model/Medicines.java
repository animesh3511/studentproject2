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
@Table(name = "medicines")
public class Medicines {

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicinesId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;





}
