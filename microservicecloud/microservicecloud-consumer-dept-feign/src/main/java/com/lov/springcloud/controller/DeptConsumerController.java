package com.lov.springcloud.controller;

import com.lov.springcloud.entity.Dept;
import com.lov.springcloud.service.DeptClientService;
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

    @Autowired
    private DeptClientService service = null;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return this.service.list();
    }



    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept){
        return this.service.add(dept);
    }

}
