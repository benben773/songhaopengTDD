package com.example.loan;

import com.example.loan.service.TestEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@RunWith(Parameterized.class)
public class ValidatorTest {
    private String sex;
    private Integer loanAge;
    private Integer age;
    private String retunMsg;

    public ValidatorTest(String sex, Integer loanAge, Integer age,String returnMsg) {
        this.sex = sex;
        this.loanAge = loanAge;
        this.age = age;
        this.retunMsg=returnMsg;
    }

    @Test
    public void should_get_fail_for_check_age() {
        String s = Validator.checkAge(loanAge, age,sex);
        assertThat(s).isEqualTo(retunMsg);
    }



    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {TestEnum.MALE.getParamValue(),30,36,"贷款年限+年龄大于65岁，无法贷款"},
                {TestEnum.MALE.getParamValue(),30,30,"可以进行贷款"},
                {TestEnum.MALE.getParamValue(),31,30,"贷款年限超过30年，无法贷款"},
                {TestEnum.MALE.getParamValue(),31,36,"贷款年限超过30年，无法贷款"},
                {TestEnum.MALE.getParamValue(),30,25,"可以进行贷款"},

        });
    }
}