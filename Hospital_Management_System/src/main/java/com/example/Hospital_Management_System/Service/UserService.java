package com.example.Hospital_Management_System.Service;

import com.example.Hospital_Management_System.Model.Request.UserRequest;

public interface UserService {


    Object saveOrUpdate(UserRequest userRequest);
}
