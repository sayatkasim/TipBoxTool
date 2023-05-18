package com.sayat.tipbox.business.abstracts;

import com.sayat.tipbox.core.utilities.results.DataResult;
import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.entities.concretes.Worker;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkerService {
    DataResult<List<Worker>> getAll();
    DataResult<List<Worker>> getAll(int pageNo, int pageSize);
    DataResult<List<Worker>> getAllSorted();
    Result add(Worker worker);
    DataResult<Worker> getByWorkerName(String workerName);
    DataResult<Worker> getByWorkerNameAndDepartmentId(String workerName, int departmentId);
    DataResult<List<Worker>> getByWorkerNameOrDepartmentId(String workerName, int departmentId);
    DataResult<List<Worker>> getByDepartmentIdIn(List<Integer> departments);
    DataResult<List<Worker>> getByWorkerNameContains(String workerName);
    DataResult<List<Worker>> getByWorkerNameStartsWith (String workerName);
    DataResult<List<Worker>> getByNameAndDepartment (String workerName, int departmentId);
}
