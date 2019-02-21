package test;

import com.alibaba.fastjson.JSON;
import com.maoyan.ssm.model.ConfigTest;
import com.maoyan.ssm.model.UserTest;
import com.maoyan.ssm.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Auther: maoyan
 * @Date: 2019/2/1 16:58
 * @Description:
 */
public class test1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        UserService userService = applicationContext.getBean(UserService.class);

//        DataSourceContextHolder.setDataSource(DataSources.MASTER);
        List<UserTest> userTest = userService.getAllUser();
        System.out.println(JSON.toJSONString(userTest));
//        System.out.println(userTest.get(0).getUserName());

//        DataSourceContextHolder.setDataSource(DataSources.SLAVE);
        List<ConfigTest> configTests = userService.getAll();
        System.out.println(JSON.toJSONString(configTests));
    }
}
