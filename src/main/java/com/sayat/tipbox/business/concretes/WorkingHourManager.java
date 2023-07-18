package com.sayat.tipbox.business.concretes;

import com.sayat.tipbox.business.abstracts.WorkingHourService;
import com.sayat.tipbox.core.utilities.results.DataResult;
import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.core.utilities.results.SuccessDataResult;
import com.sayat.tipbox.core.utilities.results.SuccessResult;
import com.sayat.tipbox.dataAccess.abstracts.WorkingHourDao;
import com.sayat.tipbox.entities.concretes.WorkingHour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkingHourManager implements WorkingHourService {
    private WorkingHourDao workingHourDao;

    @Autowired
    public WorkingHourManager(WorkingHourDao workingHourDao) {
        super();
        this.workingHourDao = workingHourDao;
    }

    @Override
    public DataResult<List<WorkingHour>> getAll() {
        return new SuccessDataResult<List<WorkingHour>>(this.workingHourDao.findAll(),"Çalışma Saatleri Listelendi");

    }

    @Override
    public Result add(WorkingHour workingHour) {
        this.workingHourDao.save(workingHour);
        return new SuccessResult("Çalışma Saati Eklendi");
    }

    @Override
    public Result delete(WorkingHour workingHour) {
        this.workingHourDao.delete(workingHour);
        return new SuccessResult("Çalışma saati silindi");
    }

    @Override
    public Result update(WorkingHour workingHour) {
        this.workingHourDao.save(workingHour);
        return new SuccessResult("Çalışma saati güncellendi");
    }

    @Override
    public DataResult<List<WorkingHour>> getByWorkingHourAndWorker(int workingHour, int WorkerId) {
        return new SuccessDataResult<List<WorkingHour>>(this.workingHourDao.getByWorkingHourAndWorker(workingHour,WorkerId),
                "Çalışma saatleri listelendi");
    }
}
