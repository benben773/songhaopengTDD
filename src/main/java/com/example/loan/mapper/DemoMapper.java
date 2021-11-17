package com.example.loan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//@Mapper
public interface DemoMapper extends BaseMapper<Demo> {

 Demo selectByCertNo(@Param("cert_no") String certNo);
}
