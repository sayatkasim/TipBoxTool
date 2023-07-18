package com.sayat.tipbox.api.controllers;

import com.sayat.tipbox.business.abstracts.BoxService;
import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.entities.concretes.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boxs")
public class BoxController {


    private BoxService boxService;
    @Autowired
    public BoxController(BoxService boxService) {
        this.boxService = boxService;
    }

    @GetMapping("/getall")
    public List<Box> getAll(){
        return this.boxService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Box box){ return this.boxService.add(box);}
    @DeleteMapping("/delete")
    public Result delete(@RequestBody Box box){return this.boxService.delete(box);}
    @PutMapping("/update")
    public Result update (@RequestBody Box box){ return this.boxService.update(box);}

}
