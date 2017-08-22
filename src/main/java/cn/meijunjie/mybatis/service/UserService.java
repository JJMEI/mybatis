package cn.meijunjie.mybatis.service;

import cn.meijunjie.mybatis.domain.User;

public interface UserService {

    void findUser(String sex, String address);
}
