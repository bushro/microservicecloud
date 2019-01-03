package com.smxy.lq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author BushRo
 * @Description: TOTO
 * @date 2018-12-29
 */
@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注入进eureka服务中
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
