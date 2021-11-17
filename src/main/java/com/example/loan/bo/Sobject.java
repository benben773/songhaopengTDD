package com.example.loan.bo;

public class Sobject {
    private String return_code;
    private String return_msg;
    private Integer loanAge;
    private String sex;
    private String certNo;

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public Integer getLoanAge() {
        return loanAge;
    }

    public void setLoanAge(Integer loanAge) {
        this.loanAge = loanAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
