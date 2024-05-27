package com.example.Hospital_Management_System.Controller;

import com.example.Hospital_Management_System.Model.Request.DoctorRequest;
import com.example.Hospital_Management_System.Model.Request.EmployeeRequest;
import com.example.Hospital_Management_System.Model.Response.CustomEntityResponse;
import com.example.Hospital_Management_System.Model.Response.EntityResponse;
import com.example.Hospital_Management_System.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiDoctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;


    @PostMapping("/SaveOrUpdateDoctor")
    public ResponseEntity<?> SaveOrUpdate(@RequestBody DoctorRequest doctorRequest)
    {

        try{
            return new ResponseEntity(new EntityResponse(doctorService.saveOrUpdate(doctorRequest),0), HttpStatus.OK);

        }catch (Exception e)
        {

            return new ResponseEntity(new CustomEntityResponse(e.getMessage(),-1),HttpStatus.OK);

        }

    }


}
