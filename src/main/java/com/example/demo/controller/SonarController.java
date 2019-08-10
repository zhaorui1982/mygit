package com.example.demo.controller;

import com.example.demo.manger.SonarService;
import com.example.demo.manger.SonarServiceImpl;
import com.example.demo.manger.explain.SonarJoupExplainImpl;
import com.example.demo.model.Sonar;
import com.example.demo.dao.SonarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SonarController {
    @Autowired
    private SonarServiceImpl sonarServiceImpl;

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getHello() {
        return "Hello,Word!!!";
    }

    @RequestMapping(value = "/getSonar", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public List<Sonar> getUser() {
        return sonarServiceImpl.getSonarList();
    }

    @RequestMapping(value = "/addSonar", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public int insertUser() {
       return sonarServiceImpl.insertSonar();
    }

}
