package com.lov.springcloud;

import com.lov.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/9.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.lov.springcloud"})
@ComponentScan("com.lov.springcloud")
public class DeptConsumer80FeignApp {

    public static void main(String[] args){

        SpringApplication.run(DeptConsumer80FeignApp.class, args);

    }

}
