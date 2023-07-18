package com.sayat.tipbox.dataAccess.abstracts;

import com.sayat.tipbox.entities.concretes.WorkingHour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkingHourDao extends JpaRepository<WorkingHour,Integer> {

    List<WorkingHour> getByWorkingHourAndWorker(int workingHour,int WorkerId);

}
