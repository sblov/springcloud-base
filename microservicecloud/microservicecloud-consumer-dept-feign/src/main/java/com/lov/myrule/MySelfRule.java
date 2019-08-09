package com.lov.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/9.
 */
@Configuration
public class MySelfRule{

    @Bean
    public IRule myRule(){
        //Ribbon默认是轮询，我自定义为随机
//        return new RandomRule();

        return new MyRandomRule();
    }

}
