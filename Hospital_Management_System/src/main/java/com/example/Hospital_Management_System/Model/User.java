package com.example.Hospital_Management_System.Model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name = "cell_no")
    private String cellNo;

    @Column(name = "security_question")
    private  String securityQuestion;

    @Column(name = "security_answer")
    private  String securityAnswer;


    @OneToOne(mappedBy = "user",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Employee employee;

    @OneToOne(mappedBy = "user",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Patient patient;

    @CreationTimestamp
    @Column(name = "user_created_at",updatable = false)
    private LocalDateTime userCreatedAt;

    @UpdateTimestamp
    @Column(name = "user_updated_at")
    private LocalDateTime userUpdatedAt;

  //  public User(Long userId)
   // {
     //   super();
      //  this.userId = userId;


    //}



    public void addEmployee(Employee e)
    {
        this.employee = e; //  this.employee: Refers to the Employee object associated with the current User.
        // setUser(this)  Calls the setUser() method of the Employee entity
        // and passes the current User object (this) as an argument.
        this.employee.setUser(this);


    }


     public void addPatient(Patient p)
     {
         this.patient = p;
         this.patient.setUser(this);


     }


}
