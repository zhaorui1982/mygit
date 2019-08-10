package com.example.demo.dao;

import com.example.demo.model.Sonar;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface SonarDao {
    // MyBatis 的注解
    @Select("select id,sum_coverage,code_lines,create_time from sonar")
    public List<Sonar> getSonarList();

    @Insert({ "insert into sonar(sum_coverage,code_lines,create_time) values(#{sumCoverage}, #{codeLines}, #{createTime,jdbcType=TIMESTAMP})" })
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertSonar(Sonar sonar);
}
