package com.sp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sp.dao.ProductDao;
import com.sp.entity.Product;
import com.sp.service.ProductService;

/**
 * ProductService实现类
 * @author Administrator
 *
 */
@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Resource
	private ProductDao productDao;
	
	/*	用户列表业务逻辑实现层
	 *  (non-Javadoc)
	 * @see com.sp.service.ProductService#find(java.util.Map)
	 */
	@Override
	public List<Product> find(Map<String, Object> product_s) {
		return productDao.find(product_s);
	}

	/* 条件查询的用户数业务逻辑实现层
	 * (non-Javadoc)
	 * @see com.sp.service.ProductService#getTotal(java.util.Map)
	 */
	@Override
	public Long getTotal(Map<String, Object> product_s) {
		return productDao.getTotal(product_s);
	}

}
