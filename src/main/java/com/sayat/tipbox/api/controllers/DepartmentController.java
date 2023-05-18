package com.sayat.tipbox.api.controllers;

import com.sayat.tipbox.business.abstracts.DepartmentService;
import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.entities.concretes.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @GetMapping("/getall")
    public List<Department> getAll(){
        return this.departmentService.getAll();
    };
    @PostMapping("/add")
    public Result add(@RequestBody Department department){
        return this.departmentService.add(department);
    }
}
