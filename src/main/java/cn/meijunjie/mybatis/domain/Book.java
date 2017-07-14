package cn.meijunjie.mybatis.domain;

public class Book 
{
	
	private Integer bookid;
	private String name;
	private Integer number;
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + ", number=" + number + "]";
	}
	
	
	
	
}
