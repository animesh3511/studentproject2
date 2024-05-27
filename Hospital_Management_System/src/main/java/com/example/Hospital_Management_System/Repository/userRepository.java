package com.example.Hospital_Management_System.Repository;

import com.example.Hospital_Management_System.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {


}
