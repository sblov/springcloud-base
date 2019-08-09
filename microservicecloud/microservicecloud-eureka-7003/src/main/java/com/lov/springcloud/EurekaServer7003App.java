package com.lov.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/9.
 */
@SpringBootApplication
/**
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 */
@EnableEurekaServer
public class EurekaServer7003App {

    public static void main(String[] args){

        SpringApplication.run(EurekaServer7003App.class, args);

    }

}
