package com.lov.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/12.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashBoardApp{

    public static void main(String[] args){
        SpringApplication.run(DeptConsumerDashBoardApp.class,args);

    }

}