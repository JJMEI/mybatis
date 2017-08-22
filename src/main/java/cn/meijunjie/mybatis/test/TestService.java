package cn.meijunjie.mybatis.test;

import cn.meijunjie.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-service.xml"})
public class TestService {

    @Autowired
    private UserService userService;

    @Test
    public void testFindUser()
    {
        userService.findUser("1","北京市");
    }
}
