package com.sayat.tipbox.business.concretes;

import com.sayat.tipbox.business.abstracts.WorkerService;
import com.sayat.tipbox.core.utilities.results.DataResult;
import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.core.utilities.results.SuccessDataResult;
import com.sayat.tipbox.core.utilities.results.SuccessResult;
import com.sayat.tipbox.dataAccess.abstracts.WorkerDao;
import com.sayat.tipbox.entities.concretes.Worker;
import com.sayat.tipbox.entities.dtos.WorkerWithDepartmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerManager implements WorkerService {

    private WorkerDao workerDao;

    @Autowired
    public WorkerManager(WorkerDao workerDao) {
        super();
        this.workerDao = workerDao;
    }

    @Override
    public DataResult<List<Worker>> getAll() {
        return new SuccessDataResult<List<Worker>>(this.workerDao.findAll(),"Çalışanlar Listelendi");

    }

    @Override
    public DataResult<List<Worker>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1,pageSize);
        return new SuccessDataResult<List<Worker>>(this.workerDao.findAll(pageable).getContent());
    }

    @Override
    public DataResult<List<Worker>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC,"workerName");
        return new SuccessDataResult<List<Worker>>(this.workerDao.findAll(sort));
    }

    @Override
    public Result add(Worker worker) {
        this.workerDao.save(worker);
        return new SuccessResult("Çalışan eklendi");
    }

    @Override
    public DataResult<Worker> getByWorkerName(String workerName) {
        return new SuccessDataResult<Worker>(this.workerDao.getByWorkerName(workerName),"Çalışanlar Listelendi");
    }

    @Override
    public DataResult<Worker> getByWorkerNameAndDepartmentId(String workerName, int departmentId) {
        return new SuccessDataResult<Worker>(this.workerDao.getByWorkerNameAndDepartmentId(workerName,departmentId),
                "Çalışanlar Listelendi");
    }

    @Override
    public DataResult<List<Worker>> getByWorkerNameOrDepartmentId(String workerName, int departmentId) {
        return new SuccessDataResult<List<Worker>>(this.workerDao.getByWorkerNameOrDepartmentId(workerName,departmentId),
                "Çalışanlar Listelendi");
    }

    @Override
    public DataResult<List<Worker>> getByDepartmentIdIn(List<Integer> departments) {
        return new SuccessDataResult<List<Worker>>(this.workerDao.getByDepartmentIdIn(departments),
                "Çalışanlar Listelendi");
    }

    @Override
    public DataResult<List<Worker>> getByWorkerNameContains(String workerName) {
        return new SuccessDataResult<List<Worker>>(this.workerDao.getByWorkerNameContains(workerName),
                "Çalışanlar Listelendi");
    }

    @Override
    public DataResult<List<Worker>> getByWorkerNameStartsWith(String workerName) {
        return new SuccessDataResult<List<Worker>>(this.workerDao.getByWorkerNameStartsWith(workerName),
                "Çalışanlar Listelendi");
    }

    @Override
    public DataResult<List<Worker>> getByNameAndDepartment(String workerName, int departmentId) {
        return new SuccessDataResult<List<Worker>>(this.workerDao.getByNameAndDepartment(workerName,departmentId),
                        "Çalışanlar Listelendi");
    }

    @Override
    public DataResult<List<WorkerWithDepartmentDto>> getWorkerWithDepartmentDetails() {
        return new SuccessDataResult<List<WorkerWithDepartmentDto>>(this.workerDao.getWorkerWithDepartmentDetails(),
                "Data Listelendi");
    }
}
