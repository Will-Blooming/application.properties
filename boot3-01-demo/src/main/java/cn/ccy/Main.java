package cn.ccy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动springboot项目的入口程序
@SpringBootApplication //注明 这是一个 springboot项目
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}