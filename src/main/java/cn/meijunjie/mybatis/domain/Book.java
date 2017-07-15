package cn.meijunjie.mybatis.domain;

public class Book 
{
	
	private Integer book_id;
	private String name;
	private Integer number;
	public Integer getbook_id() {
		return book_id;
	}
	public void setbook_id(Integer book_id) {
		this.book_id = book_id;
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
		return "Book [book_id=" + book_id + ", name=" + name + ", number=" + number + "]";
	}
	
	
	
	
}
