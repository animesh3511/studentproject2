package com.example.Hospital_Management_System.Repository;

import com.example.Hospital_Management_System.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface doctorRepository extends JpaRepository<Doctor,Long> {


}