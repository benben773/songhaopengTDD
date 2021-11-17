package com.example.loan.service;

import com.example.loan.Validator;
import com.example.loan.mapper.Demo;
import com.example.loan.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.HashMap;
import java.util.Map;

@Service
public class StestService {
@Autowired
private DemoMapper demoMapper;
    public String checkSomthing(String certNo,Integer loanAge){
        Demo demo= demoMapper.selectById(1);
        demo=demoMapper.selectByCertNo(certNo);
        Integer age1 = demo.getAge();
        String sex = demo.getSex();
        return Validator.checkAge(loanAge, age1,sex);
    }

}
