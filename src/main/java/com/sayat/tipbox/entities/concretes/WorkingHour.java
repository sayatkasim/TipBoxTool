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
@Table(name="workingHours")
public class WorkingHour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="working_hours_id")
    private int id;
    @Column(name="date")
    private Date date;
    @Column(name="working_hour")
    private int workingHour;

    @ManyToOne()
    @JoinColumn(name="worker_id")
    private Worker worker;
}
