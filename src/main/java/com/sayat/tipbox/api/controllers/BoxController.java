package com.sayat.tipbox.api.controllers;

import com.sayat.tipbox.business.abstracts.BoxService;
import com.sayat.tipbox.entities.concretes.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
