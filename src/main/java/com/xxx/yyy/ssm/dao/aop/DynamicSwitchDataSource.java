package com.xxx.yyy.ssm.dao.aop;

import com.xxx.yyy.ssm.dao.DataSources;

import java.lang.annotation.*;

/**
 * 创建拦截设置数据源的注解，可以设置在具体的类上，或者在具体的方法上
 * dataSource是当前数据源的一个别名用于标识我们的数据源的信息
 * @author: maoyan
 * @date: 2019/2/2 16:26
 * @description:
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DynamicSwitchDataSource {
    DataSources dataSource();
}
