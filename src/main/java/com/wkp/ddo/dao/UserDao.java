package com.wkp.ddo.dao;



import org.apache.ibatis.annotations.Select;

import com.wkp.ddo.domain.User;

public interface UserDao {

	@Select("select * from user where name=#{name} and pwd=#{pwd}")
	
	User dl(User user);
}
