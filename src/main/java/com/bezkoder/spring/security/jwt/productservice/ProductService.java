package com.bezkoder.spring.security.jwt.productservice;

import java.util.List;

import com.bezkoder.spring.security.jwt.productmodel.Product;

public interface ProductService {

	public Product saveProduct(Product stu);
	public Product updateProduct(Product stu,Long id);
	public void deleteProduct(Long id);
	public Product getProduct(Long id);
	public List<Product> getAllProduct();

}
