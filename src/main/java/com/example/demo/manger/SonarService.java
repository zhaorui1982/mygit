package com.example.demo.manger;

import com.example.demo.model.Sonar;

import java.util.List;

public interface SonarService {
    //查询sonar列表
    List<Sonar> getSonarList();

    //数据库插入
    int insertSonar();

    //根据create_time查询sonar数据
    Sonar getSonarByCreateTime(String createTime);
}
