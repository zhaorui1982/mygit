package com.example.demo.manger;

import com.example.demo.dao.SonarDao;
import com.example.demo.manger.explain.JoupExplain;
import com.example.demo.model.Sonar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("sonarServiceImpl")
public class SonarServiceImpl implements SonarService {
    @Autowired
    private SonarDao sonarDao;
    @Autowired
    private JoupExplain sonarJoupExplainImp;
    @Override
    public List<Sonar> getSonarList() {
        return sonarDao.getSonarList();
    }

    @Override
    public int insertSonar() {
       Sonar sonar =(Sonar) sonarJoupExplainImp.expalinEelments();
        return sonarDao.insertSonar(sonar);
    }

    @Override
    public Sonar getSonarByCreateTime(String createTime) {
        return null;
    }
}
