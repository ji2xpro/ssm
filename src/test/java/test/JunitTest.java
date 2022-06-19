package test;

import com.alibaba.fastjson.JSON;
import com.xxx.yyy.ssm.model.UserMaster;
import com.xxx.yyy.ssm.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @auther: maoyan
 * @date: 2018/8/10 16:27
 * @description:
 */
public class JunitTest {

    private UserService userService;

    @Before
    public void before(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void test(){
        UserMaster userMaster = userService.getUserById(1);
        System.out.println(JSON.toJSONString(userMaster));

        List<UserMaster> userMasters = userService.getAllUserMaster();
        System.out.println(JSON.toJSONString(userMasters));
        System.out.println(userMasters.get(0).getUserName());
    }
}
