package com.lov.springcloud.controller;

import com.lov.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/9.
 */
@RestController
public class DeptConsumerController {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";


    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value="/consumer/dept/add")
    public boolean add(Dept dept){

        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);

    }


    @GetMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);

    }

    @SuppressWarnings("unchecked")
    @GetMapping(value="/consumer/dept/list")
    public List<Dept> list(){

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);

    }

    /**
     * 测试@EnableDiscoveryClient,消费端可以调用服务发现
     */
    @RequestMapping(value="/consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);

    }

}
