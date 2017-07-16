package cn.meijunjie.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.meijunjie.mybatis.domain.User;
import cn.meijunjie.mybatis.querypo.UserQueryVo;

@Repository
public interface UserDao {
	
	@Select("select * from user where id = #{id}")
	User findUserById(int id);
	
	//综合查询,构建查询对象
	
	@Select("Select * from user where user.sex=#{user.sex} or user.username like '%${user.username}%'")
	List<User> findUserByUserQueryVo(UserQueryVo userQueryVo);
	
	//传入多个参数,动态代理是工具接口中方法的返回值来确定如果是简单类型则调用selectOne() 或者selectList()方法来执行
	@Select("select * from user where sex=#{sex} or address=#{address}")
	List<User> findUserByParam(@Param("sex") String sex, @Param("address") String address);
	//int findUserByParam(@Param("sex") String sex, @Param("address") String address);

	List<User> findUserList(UserQueryVo userQueryVo);
}
