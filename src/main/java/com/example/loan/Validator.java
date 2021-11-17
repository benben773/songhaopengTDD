package com.example.loan;

import com.example.loan.service.TestEnum;

public class Validator {
    public static String checkAge(Integer loanAge, Integer age,String sex) {

        if(loanAge>30){
            return "贷款年限超过30年，无法贷款";
        }
        if(sex== TestEnum.MALE.getParamValue()&loanAge+age>65){
            return "贷款年限+年龄大于65岁，无法贷款";
        }

        return "可以进行贷款";
    }
}
