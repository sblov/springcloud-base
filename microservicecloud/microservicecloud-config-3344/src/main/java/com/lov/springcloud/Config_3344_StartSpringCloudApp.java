package com.lov.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/22.
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp{

    public static void main(String[] args){
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);

    }

}
