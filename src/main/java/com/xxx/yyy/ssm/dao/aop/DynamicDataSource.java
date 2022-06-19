package com.xxx.yyy.ssm.dao.aop;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 多数据源选择类：拿到动态切换的Key，spring给你选择数据源
 * @auther: maoyan
 * @date: 2019/2/2 11:31
 * @description:
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}
