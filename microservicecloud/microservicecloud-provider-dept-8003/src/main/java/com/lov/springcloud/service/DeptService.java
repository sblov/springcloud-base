package com.lov.springcloud.service;

import java.util.List;
import com.lov.springcloud.entity.Dept;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/8.
 */
public interface DeptService{

    boolean add(Dept dept);

    Dept    get(Long id);

    List<Dept> list();

}


