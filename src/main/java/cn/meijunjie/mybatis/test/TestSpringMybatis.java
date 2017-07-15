package cn.meijunjie.mybatis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.meijunjie.mybatis.dao.BookDao;
import cn.meijunjie.mybatis.domain.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TestSpringMybatis {

	@Autowired
	private BookDao bookDao;
	
	@Test
	public void test()
	{
		Book book = new Book();
		book.setName("jdk源码剖析");
		book.setNumber(100);
		bookDao.insertBook(book);
		System.out.println(bookDao.selectBookById(1000));
	}
}
