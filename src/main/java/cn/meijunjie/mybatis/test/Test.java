package cn.meijunjie.mybatis.test;
import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.meijunjie.mybatis.dao.BookDao;


public class Test {

	private static final Logger logger = LoggerFactory.getLogger(Test.class);
	
	/**
	 * SqlSessionFactoryBulider 这个类可以被实例化，一旦创建了SQLSessionFactory 就不再需要它了，
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		SqlSessionFactory sessionFactory = 
				new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
		logger.info("sessionFactory{} 构建成功"+ sessionFactory);
		
		SqlSession session = sessionFactory.openSession();
		
		BookDao bookDaoMapper = session.getMapper(BookDao.class);
		
		System.out.println(bookDaoMapper.selectBookById(1000));
	}

}
