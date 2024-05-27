package com.example.Hospital_Management_System.Model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employee")
public class Employee {

  //  @Column(name = "user_id")
   // private Object userId;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "salary")
    private double salary;

    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dob;

    @DateTimeFormat(pattern = "dd-m-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "hire_date")
    private Date hireDate;

    @OneToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private Doctor doctor;


    public void setUser(User user) {
        this.user = user;
    }


    public void addDoctor(Doctor d)
    {
        this.doctor = d;
        this.doctor.setEmployee(this);


    }
}
