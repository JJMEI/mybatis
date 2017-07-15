package cn.meijunjie.mybatis.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.meijunjie.mybatis.domain.Book;

@Repository
public interface BookDao {
//	@Select("select * from book where book_id=#{bookid}")
	Book selectBookById(long bookId);
	
	void insertBook(Book book);
}
