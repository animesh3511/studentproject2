package com.example.Hospital_Management_System.Model.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MedicinesRequest {

  private Long medicinesId;

  private String name;

  private double price;



}
