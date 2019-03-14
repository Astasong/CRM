package com.sp.service;

import java.util.List;
import java.util.Map;


import com.sp.entity.Product;

/**
 * ��ƷService��
 * @author Administrator
 *
 */

public interface ProductService {
	
	/**
	 * ��Ʒ�б�(������search����)
	 * @param product_s
	 * @return
	 */
	public List<Product> find(Map<String,Object> product_s);
	
	/**
	 * ���������Ĳ�ѯ��Ʒ��
	 * @param product_s
	 * @return
	 */
	public Long getTotal(Map<String,Object> product_s);
	
	
}
