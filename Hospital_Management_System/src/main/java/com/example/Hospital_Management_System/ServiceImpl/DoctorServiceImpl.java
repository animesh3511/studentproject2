package com.example.Hospital_Management_System.ServiceImpl;

import com.example.Hospital_Management_System.Model.Doctor;
import com.example.Hospital_Management_System.Model.Request.DoctorRequest;
import com.example.Hospital_Management_System.Repository.doctorRepository;
import com.example.Hospital_Management_System.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    doctorRepository doctorrepository;

    @Override
    public Object saveOrUpdate(DoctorRequest doctorRequest) {

        if(doctorrepository.existsById(doctorRequest.getDoctorId()))
        {
            Doctor doctor = doctorrepository.findById(doctorRequest.getDoctorId()).get();

            doctor.setCharges(doctorRequest.getCharges());
            doctor.setDoctorId(doctorRequest.getDoctorId());
            doctor.setEmployee(doctorRequest.getEmployee());
            doctor.setPatients(doctorRequest.getPatients());

            return "Doctor updated";

        }
        else
        {
            Doctor doctor = new Doctor();

            doctor.setCharges(doctorRequest.getCharges());
            doctor.setDoctorId(doctorRequest.getDoctorId());
            doctor.setEmployee(doctorRequest.getEmployee());
            doctor.setPatients(doctorRequest.getPatients());

            return "Doctor saved";
        }




    }
}
