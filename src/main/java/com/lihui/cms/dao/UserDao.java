package com.lihui.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.lihui.cms.domain.User;

public interface UserDao {

	List<User> getUserList(@Param("username")String username);

	@Update("update cms_user set locked=#{locked} where id=#{id}")
	int updateLocated(@Param("id")String id, @Param("locked")String locked);

	User loginUser(User user);
	
	int registerUser(User user);

	

}
