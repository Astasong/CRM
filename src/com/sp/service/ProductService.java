package com.sp.service;

import java.util.List;
import java.util.Map;


import com.sp.entity.Product;

/**
 * 产品Service层
 * @author Administrator
 *
 */

public interface ProductService {
	
	/**
	 * 产品列表(包含有search条件)
	 * @param product_s
	 * @return
	 */
	public List<Product> find(Map<String,Object> product_s);
	
	/**
	 * 满足条件的查询产品数
	 * @param product_s
	 * @return
	 */
	public Long getTotal(Map<String,Object> product_s);
	
	
}
