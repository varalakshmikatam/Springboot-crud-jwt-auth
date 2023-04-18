package com.bezkoder.spring.security.jwt.productcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.security.jwt.productmodel.Product;
import com.bezkoder.spring.security.jwt.productservice.ProductService;
@CrossOrigin("http://localhost:8081")
@RequestMapping("/api/product")
@RestController
public class ProductController {
@Autowired
private ProductService service;


@PostMapping("/save")
public Product save(@RequestBody Product stu,Model m)
{
	Product s=service.saveProduct(stu);
	
	return s; 	
}
@DeleteMapping("/delete/{id}")
public void delete(@PathVariable Long id)
{
	service.deleteProduct(id);
}
@GetMapping("/get/{id}")
public Product getOne(@PathVariable Long id)
                
{
	Product stu=service.getProduct(id);
	return stu;
}
@GetMapping("/getAll")
public List<Product> getAll() {
	List<Product> stus=service.getAllProduct();
	return stus;
}

@PutMapping("/update/{id}")
public Product update(@RequestBody Product stu,
		@PathVariable Long id)

{
	Product s=service.updateProduct(stu, id);
	return s;
}


/*@GetMapping(value = "/pessoas", produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<String> lerArquivo() throws Exception {

    String line = null;
    try {
        FileReader ler = new FileReader("nomes.txt");
        BufferedReader reader = new BufferedReader(ler);
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return new ResponseEntity<String>(line, HttpStatus.OK);
}*/

}

