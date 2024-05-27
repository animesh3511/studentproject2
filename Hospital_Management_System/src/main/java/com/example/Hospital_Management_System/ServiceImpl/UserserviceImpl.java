package com.example.Hospital_Management_System.ServiceImpl;

import com.example.Hospital_Management_System.Model.Employee;
import com.example.Hospital_Management_System.Model.Request.UserRequest;
import com.example.Hospital_Management_System.Model.User;
import com.example.Hospital_Management_System.Repository.employeeRepository;
import com.example.Hospital_Management_System.Repository.userRepository;
import com.example.Hospital_Management_System.Service.EmployeeService;
import com.example.Hospital_Management_System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserserviceImpl implements UserService {

    @Autowired
    userRepository userrepository;


    @Transactional
    @Override
    public Object saveOrUpdate(UserRequest userRequest) {

      if(userrepository.existsById(userRequest.getUserId()))
      {
          User user = userrepository.findById(userRequest.getUserId()).get();
          user.setUserId(userRequest.getUserId());
          user.setCellNo(userRequest.getCellNo());
          user.setEmail(userRequest.getEmail());
          user.setPassword(userRequest.getPassword());
          user.setFirstName(userRequest.getFirstName());
          user.setLastName(userRequest.getLastName());
          user.setRole(userRequest.getRole());
          user.setSecurityAnswer(userRequest.getSecurityAnswer());
          user.setSecurityQuestion(userRequest.getSecurityQuestion());
         // System.out.println(userRequest.getEmployee().getEmployeeId());
          user.setEmployee(userRequest.getEmployee());
          user.setPatient(userRequest.getPatient());

          userrepository.save(user);

          return "user updated";


      }
      else
      {
          User user = new User();

          user.setUserId(userRequest.getUserId());
          System.out.println(userRequest.getUserId());

          user.setEmail(userRequest.getEmail());
          System.out.println(userRequest.getEmail());

          user.setPassword(userRequest.getPassword());
          System.out.println(userRequest.getPassword());

          user.setFirstName(userRequest.getFirstName());
          System.out.println(userRequest.getFirstName());

          user.setLastName(userRequest.getLastName());
          System.out.println(userRequest.getLastName());

          user.setRole(userRequest.getRole());
          System.out.println(userRequest.getRole());

          user.setCellNo(userRequest.getCellNo());
          System.out.println(userRequest.getCellNo());

          user.setSecurityQuestion(userRequest.getSecurityQuestion());
          System.out.println(userRequest.getSecurityQuestion());

          user.setSecurityAnswer(userRequest.getSecurityAnswer());
          System.out.println(userRequest.getSecurityAnswer());

          user.setEmployee(userRequest.getEmployee());
          System.out.println(userRequest.getEmployee());
          user.setPatient(userRequest.getPatient());


           userrepository.save(user);

          //Employee employee = new Employee();

          //employee.setUserId(savedUser.getUserId());

          //employeerepository.save(employee);

          return "user saved";
      }


    }
}
