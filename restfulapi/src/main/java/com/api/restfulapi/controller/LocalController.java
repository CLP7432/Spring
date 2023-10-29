package com.api.restfulapi.controller;

import com.api.restfulapi.entity.Local;
import com.api.restfulapi.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findAllLocals")
    public List<Local> findAllLocals(){
        return localService.findAllLocals();
    }
}
