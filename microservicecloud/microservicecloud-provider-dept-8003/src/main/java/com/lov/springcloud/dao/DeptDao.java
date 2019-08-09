package com.lov.springcloud.dao;

import com.lov.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/8.
 */
@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}
