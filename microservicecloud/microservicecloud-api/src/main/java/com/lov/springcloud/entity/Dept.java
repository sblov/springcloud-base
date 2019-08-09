package com.lov.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Description :
 *
 * @author Zhao Ke
 * @since 2019/8/8.
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
/**
 * @Accessors用于配置getter和setter方法的生成结果
 */
@Accessors(chain=true)
/**
 * 必须序列化
 */
public class Dept implements Serializable{

    /**
     * 主键
     */
    private Long  deptno;
    /**
     * 部门名称
     */
    private String  dname;
    /**
     * 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
     */
    private String  db_source;

    public Dept(String dname){
        super();
        this.dname = dname;
    }

}