package test;

import com.alibaba.fastjson.JSON;
import com.maoyan.ssm.model.User;
import com.maoyan.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Auther: maoyan
 * @Date: 2018/8/10 15:17
 * @Description:
 */

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class test {
    @Resource(name = "userService")
    private UserService userService;

   @Test
    public void testSpringAndMybatis(){

        User user = userService.getUserById(2);
       System.out.println(user.toString());

        System.out.println(JSON.toJSONString(user));
        
    }
}
