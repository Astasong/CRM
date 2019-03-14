package com.sp.dao;

import java.util.List;
import java.util.Map;
import com.sp.entity.User;

/**
 * 	�û�Dao��
 * @author Administrator
 *
 */
public interface UserDao {
	
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
