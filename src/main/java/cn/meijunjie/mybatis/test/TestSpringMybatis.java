package cn.meijunjie.mybatis.test;




import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.meijunjie.mybatis.dao.UserDao;
import cn.meijunjie.mybatis.domain.User;
import cn.meijunjie.mybatis.querypo.UserQueryVo;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TestSpringMybatis {

//	@Autowired
//	private BookDao bookDao;
	
//	@Test
//	public void testBook()
//	{
//		Book book = new Book();
//		book.setName("jdk源码剖析");
//		book.setNumber(100);
//		//bookDao.insertBook(book);
//		System.out.println(bookDao.selectBookById(1000));
//	}
	
	
	@Autowired
	private UserDao userDao;
	
	@org.junit.Test
	public void testFindUserById()
	{
		System.out.println(userDao.findUserById(1));
	}
	
	@org.junit.Test
	public void testFindUserByUserQueryVo()
	{
		User user = new User();
		user.setSex("1");
//		user.setUsername("张三丰");
		user.setAddress("北京市");
		UserQueryVo userQueryVo = new UserQueryVo();
		userQueryVo.setUser(user);
//		System.out.println(userDao.findUserByUserQueryVo(userQueryVo));
		System.out.println(userDao.findUserList(userQueryVo));
	}
	
	@org.junit.Test
	public void testFindUserByMultiParam()
	{
		System.out.println(userDao.findUserByParam("1", "北京市"));
	}
	
}
