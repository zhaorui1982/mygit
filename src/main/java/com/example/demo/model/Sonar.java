package com.example.demo.model;

import lombok.Data;

@Data
public class Sonar {
    private Integer id;
    private String sumCoverage;
    private String codeLines;
    private String createTime;
}
