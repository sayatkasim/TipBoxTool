package com.sayat.tipbox.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "boxs")
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="box_id")
    private int id;
    @Column(name="tip")
    private double tip;
    @Column(name="date")
    private Date date;

}
