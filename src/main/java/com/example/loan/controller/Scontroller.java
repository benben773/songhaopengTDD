package com.example.loan.controller;

import com.example.loan.service.DemoService;
import com.example.loan.service.StestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/STest")
public class Scontroller {
@Autowired
private DemoService demoService;
@Autowired
private StestService stestService;
    @RequestMapping("/ttt/no")
    public String Ste(@RequestParam String certNo,@RequestParam Integer loanAge){

        return stestService.checkSomthing(null,loanAge);
    }
}
