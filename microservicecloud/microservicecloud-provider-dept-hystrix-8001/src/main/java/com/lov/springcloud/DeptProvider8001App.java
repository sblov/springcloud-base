package com.lov.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/8.
 */
@SpringBootApplication
/**
 * 本服务启动后会自动注册进eureka服务中
 */
@EnableEurekaClient
/**
 * 服务发现
 */
@EnableDiscoveryClient
/**
 * 对hystrixR熔断机制的支持
 */
@EnableCircuitBreaker
public class DeptProvider8001App{

    public static void main(String[] args)    {

        SpringApplication.run(DeptProvider8001App.class, args);

    }

}
