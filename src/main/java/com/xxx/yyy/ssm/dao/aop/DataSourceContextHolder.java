package com.xxx.yyy.ssm.dao.aop;

import com.xxx.yyy.ssm.dao.DataSources;

/**
 * 多数据源操作
 * @auther: maoyan
 * @date: 2019/2/2 11:48
 * @description:
 */
public class DataSourceContextHolder {
    //线程本地环境,通过TheadLocal来保存每个线程选择哪个数据源的标志(key)
    private static final ThreadLocal<DataSources> dataSourceType = new ThreadLocal<DataSources>(){
        @Override
        protected DataSources initialValue(){
            return DataSources.MASTER;
        }
    };
    //获取数据源
    public static DataSources getDataSource(){
        return dataSourceType.get();
    }
    //设置数据源
    public static void setDataSource(DataSources dataSource){
        dataSourceType.set(dataSource);
    }

    public static void resetDataSource(){
        dataSourceType.set(DataSources.MASTER);
    }
    //清除数据源
    public static void removeDataSource(){
        dataSourceType.remove();
    }
}
