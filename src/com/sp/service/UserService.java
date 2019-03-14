package com.sp.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sp.entity.User;

/**
 * �û�Service��
 * @author Administrator
 *
 */

public interface UserService {
	
	/**
	 * �û���¼
	 * @param user
	 * @return
	 */
	public User login(User user);
	
	/**
	 * �û��б�(������search����)
	 * @param user_s
	 * @return
	 */
	public List<User> find(Map<String,Object> user_s);
	
	/**
	 * ���������Ĳ�ѯ�û���
	 * @param user_s
	 * @return
	 */
	public Long getTotal(Map<String,Object> user_s);
	
	/**
	 * �û���������
	 * @param user
	 * @return
	 */
	public int add(User user);
	
	/**
	 * �û����²���
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * �û�ɾ������
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}
