package cn.meijunjie.mybatis.service;

import cn.meijunjie.mybatis.dao.UserDao;
import cn.meijunjie.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public void findUser(String sex, String address) {
        System.out.println(userDao.findUserByParam(sex,address).toString());
    }
}
