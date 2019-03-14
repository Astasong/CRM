package com.sp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sp.dao.UserDao;
import com.sp.entity.User;
import com.sp.service.UserService;

/**
 * UserService实现类
 * @author Administrator
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	/* login业务逻辑实现层
	 * (non-Javadoc)
	 * @see com.sp.service.UserService#login(com.sp.entity.User)
	 */
	@Override
	public User login(User user) {
		return userDao.login(user);
	}

	/*	用户列表业务逻辑实现层
	 *  (non-Javadoc)
	 * @see com.sp.service.UserService#find(java.util.Map)
	 */
	@Override
	public List<User> find(Map<String, Object> user_s) {
		return userDao.find(user_s);
	}

	/* 条件查询的用户数业务逻辑实现层
	 * (non-Javadoc)
	 * @see com.sp.service.UserService#getTotal(java.util.Map)
	 */
	@Override
	public Long getTotal(Map<String, Object> user_s) {
		return userDao.getTotal(user_s);
	}

	
	/* 用户添加业务逻辑实现层
	 * (non-Javadoc)
	 * @see com.sp.service.UserService#add(com.sp.entity.User)
	 */
	@Override
	public int add(User user) {
		return userDao.add(user);
	}

	/* 用户更新业务逻辑实现层
	 * (non-Javadoc)
	 * @see com.sp.service.UserService#update(com.sp.entity.User)
	 */
	@Override
	public int update(User user) {
		return userDao.update(user);
	}

	/* 用户删除操作业务逻辑实现层
	 * (non-Javadoc)
	 * @see com.sp.service.UserService#delete(java.lang.Integer)
	 */
	@Override
	public int delete(Integer id) {
		return userDao.delete(id);
	}

}
