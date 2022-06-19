package com.xxx.yyy.ssm.dao.aop;

import com.xxx.yyy.ssm.dao.DataSources;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 使用AOP拦截特定的注解去动态的切换数据源
 * 通过增加一个切面去拦截servcie层在调用mybatis生成的接口时，来切换数据源，从而省去每次调用mybatis生成的接口时都要手动注明数据源
 * @auther: maoyan
 * @date: 2019/2/2 16:28
 * @description:
 */
@Aspect
@Component
@Order(1) //多个aop配置时需要指定加载顺序（事务也是一个） -1为最先执行
public class DataSourceInterceptor {
    //@within在类上设置
    //@annotation在方法上进行设置
    @Pointcut("@within(com.xxx.yyy.ssm.dao.aop.DynamicSwitchDataSource)||@annotation(com.xxx.yyy.ssm.dao.aop.DynamicSwitchDataSource)")
    public void pointcut() {}

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint)
    {
        Method method = ((MethodSignature)joinPoint.getSignature()).getMethod();
        DynamicSwitchDataSource annotationClass = method.getAnnotation(DynamicSwitchDataSource.class);//获取方法上的注解
        if(annotationClass == null){
            annotationClass = joinPoint.getTarget().getClass().getAnnotation(DynamicSwitchDataSource.class);//获取类上面的注解
            if(annotationClass == null) return;
        }
        //获取注解上的数据源的值的信息
        DataSources dataSourceKey = annotationClass.dataSource();
        if(dataSourceKey !=null){
            //给当前的执行SQL的操作设置特殊的数据源的信息
            DataSourceContextHolder.setDataSource(dataSourceKey);
        }
//        System.out.println("AOP动态切换数据源，className"+joinPoint.getTarget().getClass().getName()+"methodName"+method.getName()+";dataSourceKey:"+dataSourceKey==""?"默认数据源":dataSourceKey);
    }

    @After("pointcut()")
    public void after() {
        //清理掉当前设置的数据源，让默认的数据源不受影响
        DataSourceContextHolder.removeDataSource();
    }

}
