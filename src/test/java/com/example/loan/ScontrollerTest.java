package com.example.loan;

import com.example.loan.mapper.Demo;
import com.example.loan.mapper.DemoMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(classes = LoanServerApplication.class)
@Transactional(rollbackFor = TransactionException.class)
public class ScontrollerTest {

    MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;
    @Autowired
    private DemoMapper demoMapper;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void demo_test() throws Exception {
            //given
        Demo demo = new Demo();
            demo.setName("songhp");
            demo.setCertNo("110222199101102203");
            demo.setAge(30);
            demo.setSex("1");
            demoMapper.insert(demo);
            //when
        String result = mockMvc.perform(get(String.format("/STest/ttt/no?certNo=110222199101102203&loanAge=36")))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

            //then
        assertThat(result).isEqualTo("贷款年限+年龄大于65岁，无法贷款");
    }

}
