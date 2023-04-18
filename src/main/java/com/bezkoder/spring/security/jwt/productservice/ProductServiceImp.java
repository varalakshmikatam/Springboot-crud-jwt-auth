package com.bezkoder.spring.security.jwt.productservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.security.jwt.productmodel.Product;
import com.bezkoder.spring.security.jwt.productrepository.ProductRepository;
@Service
public class ProductServiceImp implements ProductService {

	
	@Autowired
	private ProductRepository repo;
	
	@Override
	public Product saveProduct(Product pro) {
		// TODO Auto-generated method stub
		
		
	    Double  total=(pro.getPrice()*pro.getQuantity());
		pro.setTotal(total);
		
		Product s1=repo.save(pro);
		return s1;
	
	}

	@Override
	public Product updateProduct(Product stu, Long id) {
		// TODO Auto-generated method stub
		
		Optional<Product> optional=repo.findById(id);
		Product stu1=optional.get();
		stu1.setId(id);
		stu1.setProductName(stu.getProductName());
		stu1.setPrice(stu.getPrice());
		stu1.setQality(stu.getQality());
		stu1.setQuantity(stu.getQuantity());
		//stu1.setPercentage(stu.getPercentage());
		stu1.setTotal(stu.getTotal());
		Product s1=repo.save(stu);
		return s1;
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public Product getProduct(Long id) {
		/// TODO Auto-generated method stub
		Product s=repo.findById(id).get();
		return s;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> stus=repo.findAll();
		return stus;
	}

}
