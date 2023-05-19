package com.sayat.tipbox.api.controllers;

import com.sayat.tipbox.business.abstracts.WorkerService;
import com.sayat.tipbox.core.utilities.results.DataResult;
import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.entities.concretes.Worker;
import com.sayat.tipbox.entities.dtos.WorkerWithDepartmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkersController {


    private WorkerService workerService;

    @Autowired
    public WorkersController(WorkerService workerService) {
        super();
        this.workerService = workerService;
    }


    @GetMapping("/getAll")
    public DataResult<List<Worker>> getAll(){
        return this.workerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Worker worker){
        return this.workerService.add(worker);
    }
    @GetMapping("/getByWorkerName")
    public DataResult<Worker> getByWorkerName(@RequestParam String workerName){
        return this.workerService.getByWorkerName(workerName);
    }
    @GetMapping("/getByWorkerNameAndDepartmentId")
    public DataResult<Worker> getByWorkerNameAndDepartmentId(@RequestParam String workerName, int departmentId){
        return this.workerService.getByWorkerNameAndDepartmentId(workerName,departmentId);
    }
    @GetMapping("/getByWorkerNameOrDepartmentId")
    public DataResult<List<Worker>> getByWorkerNameOrDepartmentId(@RequestParam String workerName, int departmentId){
        return this.workerService.getByWorkerNameOrDepartmentId(workerName,departmentId);
    }
    @GetMapping("/getByDepartmentIdIn")
    public DataResult<List<Worker>> getByDepartmentIdIn(@RequestParam List<Integer> departments){
        return this.workerService.getByDepartmentIdIn(departments);
    }
    @GetMapping("/getByWorkerNameContains")
    public DataResult<List<Worker>> getByWorkerNameContains(@RequestParam String workerName){
        return this.workerService.getByWorkerNameContains(workerName);
    }
    @GetMapping("/getByWorkerNameStartsWith")
    public DataResult<List<Worker>> getByWorkerNameStartsWith (@RequestParam String workerName){
        return this.workerService.getByWorkerNameStartsWith(workerName);
    }
    @GetMapping("/getByNameAndDepartment")
    public DataResult<List<Worker>> getByNameAndDepartment (@RequestParam String workerName, int departmentId){
        return this.workerService.getByNameAndDepartment(workerName,departmentId);
    }
    @GetMapping("/getAllByPage")
    public DataResult<List<Worker>> getAll(@RequestParam int pageNo, int pageSize){
        return this.workerService.getAll(pageNo,pageSize);
    }
    @GetMapping("/getAllDesc")
    public DataResult<List<Worker>> getAllSorted(){
        return this.workerService.getAllSorted();
    }

    @GetMapping("/getWorkerWithDepartmentDetails")
    public DataResult<List<WorkerWithDepartmentDto>> getWorkerWithDepartmentDetails(){
        return this.workerService.getWorkerWithDepartmentDetails();
    }
}
