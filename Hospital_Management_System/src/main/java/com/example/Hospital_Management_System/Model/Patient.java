package com.example.Hospital_Management_System.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "patients")
public class Patient {

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ward_id")
    private Ward ward;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date dob;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date dateOfAddmission;

    private  String bloodGroup;
    private String prescription;
    private int bedAllowed;
    private  String paymentStatus;
    private String patientProblem;

    @OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    private List<MedicineAssigned> medicines;

   // public Patient(User user, Ward ward,Doctor doctor)
    //{
    //  super();
    //  this.user=user;
    //  this.ward=ward;
     // this.doctor=doctor;

    //}

   // public Patient(Long patientId,Date dateOfAddmission,Date dob,String bloodGroup,String prescription
     //                  ,int bedAllowed,String paymentStatus,String patientProblem)
    //{
      //super();
      //this.patientId=patientId;
      //this.bedAllowed=bedAllowed;
      //this.bloodGroup=bloodGroup;
      //this.dateOfAddmission=dateOfAddmission;
      //this.dob=dob;
      //this.prescription=prescription;
      //this.paymentStatus=paymentStatus;
      //this.patientProblem=patientProblem;


    //}

    //public Patient(Long patientId,String prescription,int bedAllowed)
    //{
      //  super();
      //  this.patientId=patientId;
      //  this.prescription=prescription;
       // this.bedAllowed=bedAllowed;


    //}


    public void medicineAssigned(MedicineAssigned medicine)
    {
       medicine.setPatient(this);
       medicines.add(medicine);


    }

}
