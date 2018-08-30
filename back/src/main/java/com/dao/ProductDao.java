package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDao {

	public boolean insertProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	public List<Product> ListProduct();
}
