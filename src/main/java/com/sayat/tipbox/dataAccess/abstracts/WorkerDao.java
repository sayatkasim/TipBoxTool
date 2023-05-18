package com.sayat.tipbox.dataAccess.abstracts;

import com.sayat.tipbox.entities.concretes.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkerDao extends JpaRepository<Worker,Integer> {
    Worker getByWorkerName(String workerName);
    Worker getByWorkerNameAndDepartmentId(String workerName, int departmentId);
    List<Worker> getByWorkerNameOrDepartmentId(String workerName, int departmentId);
    List<Worker> getByDepartmentIdIn(List<Integer> departments);
    List<Worker> getByWorkerNameContains(String workerName);
    List<Worker> getByWorkerNameStartsWith (String workerName);
    @Query("from Worker where workerName=:workerName and department=:departmentId")
    List<Worker> getByNameAndDepartment (String workerName, int departmentId);
}
