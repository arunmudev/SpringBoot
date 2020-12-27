package com.springboot.springboot.controller;

import java.util.List;

import com.springboot.springboot.model.SpringBootModel;
import com.springboot.springboot.service.SpringBootService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

    @Autowired
    private SpringBootService service;

    @GetMapping("index")
    public List<SpringBootModel> index(){
        List<SpringBootModel> list = service.fetchData();
        System.out.println(list.size());        
        return list;
    }
}
