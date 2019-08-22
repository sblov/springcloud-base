package com.lov.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/12.
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527StartSpringCloudApp{

    public static void main(String[] args){

        SpringApplication.run(Zuul9527StartSpringCloudApp.class, args);

    }

}
