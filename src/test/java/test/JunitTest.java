package test;

import com.alibaba.fastjson.JSON;
import com.maoyan.ssm.model.User;
import com.maoyan.ssm.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: maoyan
 * @Date: 2018/8/10 16:27
 * @Description:
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

        User user = userService.getUserById(1);
        System.out.println(JSON.toJSONString(user));

    }
}
