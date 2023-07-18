package com.sayat.tipbox.business.abstracts;

import com.sayat.tipbox.core.utilities.results.DataResult;
import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.entities.concretes.WorkingHour;

import java.util.List;

public interface WorkingHourService {
    DataResult<List<WorkingHour>> getAll();
    Result add(WorkingHour workingHour);
    Result delete(WorkingHour workingHour);
    Result update(WorkingHour workingHour);
    DataResult<List<WorkingHour>> getByWorkingHourAndWorker(int workingHour,int WorkerId);

}
