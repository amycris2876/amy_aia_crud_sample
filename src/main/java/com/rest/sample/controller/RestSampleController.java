package com.rest.sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.sample.model.Product;
import com.rest.sample.service.RestSampleService;

@RestController
public class RestSampleController {
		
		@Autowired
		private RestSampleService service; 
	
		@RequestMapping(value = "/")
		public String getHello() {
			return "<h1>Hello</h1>";
		}
		
		@PostMapping("/addProduct")
	    public Product addProduct(@RequestBody Product product) {
	        return service.saveProduct(product);
	    }

	    @PostMapping("/addProducts")
	    public List<Product> addProducts(@RequestBody List<Product> products) {
	        return service.saveProducts(products);
	    }

	    @GetMapping("/products")
	    public List<Product> findAllProducts() {
	        return service.getProducts();
	    }
	    
	    @RequestMapping("/allproducts")
	    public ResponseEntity<Object> getProducts() {
	    	Map<String, Product> productRepo = new HashMap<>();
	    	for (Product product: service.getProducts()) {
	    		productRepo.put(String.valueOf(product.getId()),product);
	    	}
	    	return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
         }

	    @GetMapping("/productById/{id}")
	    public Product findProductById(@PathVariable int id) {
	        return service.getProductById(id);
	    }

	    @GetMapping("/product/{name}")
	    public Product findProductByName(@PathVariable String name) {
	        return service.getProductByName(name);
	    }

		/*
		 * @PutMapping("/update") public Product updateProduct(@RequestBody Product
		 * product) { return service.updateProduct(product); }
		 */

	    @DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteProduct(id);
	    }

	   
}
