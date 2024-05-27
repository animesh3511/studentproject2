package com.example.Hospital_Management_System.Controller;


import com.example.Hospital_Management_System.Model.Request.UserRequest;
import com.example.Hospital_Management_System.Model.Response.CustomEntityResponse;
import com.example.Hospital_Management_System.Model.Response.EntityResponse;
import com.example.Hospital_Management_System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

     @Autowired
     UserService userService;


     @PostMapping("/SaveOrUpdate")
  public ResponseEntity<?> SaveOrUpdate(@RequestBody UserRequest userRequest)
  {

      try{
          return new ResponseEntity(new EntityResponse(userService.saveOrUpdate(userRequest),0), HttpStatus.OK);

      }catch (Exception e)
      {

        return new ResponseEntity(new CustomEntityResponse(e.getMessage(),-1),HttpStatus.OK);

      }

  }




}
