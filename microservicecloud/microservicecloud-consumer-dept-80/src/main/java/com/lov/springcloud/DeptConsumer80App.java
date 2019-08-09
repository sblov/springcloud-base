package com.lov.springcloud;

import com.lov.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/9.
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= MySelfRule.class)
public class DeptConsumer80App {

    public static void main(String[] args){

        SpringApplication.run(DeptConsumer80App.class, args);

    }

}
