package com.sayat.tipbox.dataAccess.abstracts;

import com.sayat.tipbox.entities.concretes.Worker;
import com.sayat.tipbox.entities.dtos.WorkerWithDepartmentDto;
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

    @Query("select new com.sayat.tipbox.entities.dtos.WorkerWithDepartmentDto" +
            "(w.id,w.workerName,d.departmentName)" +
            "from Department d inner join d.workers w")
    List<WorkerWithDepartmentDto> getWorkerWithDepartmentDetails();
}
