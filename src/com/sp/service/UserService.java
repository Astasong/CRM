package com.sp.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sp.entity.User;

/**
 * 用户Service层
 * @author Administrator
 *
 */

public interface UserService {
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public User login(User user);
	
	/**
	 * 用户列表(包含有search条件)
	 * @param user_s
	 * @return
	 */
	public List<User> find(Map<String,Object> user_s);
	
	/**
	 * 满足条件的查询用户数
	 * @param user_s
	 * @return
	 */
	public Long getTotal(Map<String,Object> user_s);
	
	/**
	 * 用户条件操作
	 * @param user
	 * @return
	 */
	public int add(User user);
	
	/**
	 * 用户更新操作
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * 用户删除操作
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}
