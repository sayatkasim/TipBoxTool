package com.sayat.tipbox.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="departments")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","workers"})
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="department_id")
    private int  id;

    @Column(name="department_name")
    private String departmentName;

    @Column(name="department_ratio")
    private double departmentRatio;

    @OneToMany(mappedBy = "department")
    private List<Worker> workers;

}
