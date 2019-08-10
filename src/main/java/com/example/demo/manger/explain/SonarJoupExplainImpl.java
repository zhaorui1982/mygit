package com.example.demo.manger.explain;

import com.example.demo.manger.explain.JoupExplain;
import com.example.demo.model.Sonar;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

//@Service(value = "sonarJoupExplainImp")
public class SonarJoupExplainImpl implements JoupExplain<Sonar> {

    @Override
    public Sonar expalinEelments() {
        Sonar sonar = new Sonar();
        sonar.setCodeLines("1000");
        sonar.setCreateTime("2019-08-11 14:23:11");
        sonar.setSumCoverage("78.2");
        return sonar;

    }

    public void connectSonarUrl() {
        //目标地址
        String url = "https://www.baidu.com";
        try {
            Document document = Jsoup.connect(url).header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.80 Safari/537.36").get();
            //  右侧导航栏
            Elements nav_com = document.getElementsByClass("nav_com");
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        new SonarJoupExplainImpl().connectSonarUrl();
        System.out.println(123);
    }
}
