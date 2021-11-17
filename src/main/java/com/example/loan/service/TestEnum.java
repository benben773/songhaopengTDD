package com.example.loan.service;

public enum TestEnum {
    MALE("男性","1"),
    FEMALE("女性","2");

    private String paramDesc;

    private String paramValue;

    TestEnum(String paramDesc, String paramValue) {
        this.paramDesc = paramDesc;
        this.paramValue = paramValue;
    }
    public String getParamDesc() {
        return paramDesc;
    }

    public String getParamValue() {
        return paramValue;
    }

    }
