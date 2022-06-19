package test;

import com.alibaba.fastjson.JSON;
import com.xxx.yyy.ssm.model.UserMaster;
import com.xxx.yyy.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @auther: maoyan
 * @date: 2018/8/10 15:17
 * @description:
 */

@RunWith(SpringJUnit4ClassRunner.class)        //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test2 {
    @Resource(name = "userService")
    private UserService userService;

    @Test
    public void testSpringAndMybatis() {
        UserMaster userMaster = userService.getUserById(1);
        System.out.println(userMaster.toString());
        System.out.println(JSON.toJSONString(userMaster));
    }
}
