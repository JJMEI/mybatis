package cn.meijunjie.mybatis.dao;

import org.apache.ibatis.annotations.Select;

import cn.meijunjie.mybatis.domain.Book;

public interface BookDao {
	@Select("select * from book where book_id=#{bookid}")
	Book selectBookById(long bookId);
}
