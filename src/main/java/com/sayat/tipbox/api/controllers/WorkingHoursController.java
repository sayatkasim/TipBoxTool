package com.sayat.tipbox.api.controllers;

import com.sayat.tipbox.business.abstracts.WorkingHourService;
import com.sayat.tipbox.core.utilities.results.DataResult;
import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.entities.concretes.WorkingHour;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workingHours")
public class WorkingHoursController {
    private WorkingHourService workingHourService;

    public WorkingHoursController(WorkingHourService workingHourService) {
        super();
        this.workingHourService = workingHourService;
    }
    @GetMapping("/getAll")
    public DataResult<List<WorkingHour>> getAll(){return this.workingHourService.getAll();}
    @PostMapping("/add")
    public Result add(@RequestBody WorkingHour workingHour){return this.workingHourService.add(workingHour);}
    @DeleteMapping("/delete")
    public Result delete(@RequestBody WorkingHour workingHour){return this.workingHourService.delete(workingHour);}
    @PutMapping ("/update")
    public Result update(@RequestBody WorkingHour workingHour){return this.workingHourService.update(workingHour);}
    @GetMapping("/getByWorkingHourAndWorker")
    public DataResult<List<WorkingHour>> getByWorkingHourAndWorker(@RequestParam int workingHour,int WorkerId){
        return this.workingHourService.getByWorkingHourAndWorker(workingHour,WorkerId);
    }

}
