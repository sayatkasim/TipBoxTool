package com.sayat.tipbox.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="workers")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="worker_id")
    private int id;
    //@Column(name="department_id")
    //private int departmentId;
    @Column(name="worker_name")
    private String workerName;
    @Column(name="worker_surname")
    private String workerSurname;
    @Column(name="identityNumber")
    private String identityNumber;

    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Department department;

}
