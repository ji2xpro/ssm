package test;

import com.alibaba.fastjson.JSON;
import com.xxx.yyy.ssm.model.UserMaster;
import com.xxx.yyy.ssm.model.UserSlave;
import com.xxx.yyy.ssm.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @auther: maoyan
 * @date: 2019/2/1 16:58
 * @description:
 */
public class Test3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserService userService = applicationContext.getBean(UserService.class);

//        DataSourceContextHolder.setDataSource(DataSources.MASTER);
        List<UserMaster> userMasters = userService.getAllUserMaster();
        System.out.println(JSON.toJSONString(userMasters));
        System.out.println(userMasters.get(0).getUserName());


//        DataSourceContextHolder.setDataSource(DataSources.SLAVE);
        List<UserSlave> userSlaves = userService.getAllUserSlave();
        System.out.println(JSON.toJSONString(userSlaves));
        System.out.println(userSlaves.get(0).getUserName());
    }
}
