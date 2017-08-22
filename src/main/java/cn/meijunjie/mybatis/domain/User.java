package cn.meijunjie.mybatis.domain;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private Integer id;
	private String username;
	private Date birthday;
	private String sex;
	private String address;

	
	
}
