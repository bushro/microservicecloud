package com.smxy.lq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author BushRo
 * @Description: TOTO
 * @date 2019-01-02
 */
@EnableFeignClients //开启feign
@EnableEurekaClient //注入进eureka服务中
@SpringBootApplication
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
