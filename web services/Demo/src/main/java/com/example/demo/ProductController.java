package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Products")
public class ProductController {
	
	private List<Product> products=new ArrayList<>(
		Arrays.asList(
				new Product(1,"laptop",50000),
				new Product(2,"phone",30000)
				)
	);
	
	//Get all products
	@GetMapping
	public List<Product> getAllProducts()	{
		return products;
	}
	
	//get products by Id
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id)
	{
		return products.stream()
				.filter(p->p.getId()==id)
				.findFirst()
				.orElse(null);
	}
	
	//post add new product
	@PostMapping
	public Product addProduct(@RequestBody Product product)
	{
		products.add(product);
		return product;
	}
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable int id, @RequestBody Product updateProduct)
	{
		for(Product p:products)
		{
			if (p.getId() == id) {
                p.setName(updateProduct.getName());
                p.setPrice(updateProduct.getPrice());
                return p;
            }
		}
		return null; // If product not found
	}
	
	
	@DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        boolean removed = products.removeIf(p -> p.getId() == id);
        if (removed) {
            return "Product with ID " + id + " deleted successfully!";
        } else {
            return "Product not found!";
        }
    }
}
//package com.example;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//
//    private List<Product> products = new ArrayList<>(
//        Arrays.asList(
//            new Product(1, "Laptop", 50000),
//            new Product(2, "Mobile", 40000)
//        )
//    );
//
//   
//    @GetMapping
//    public List<Product> getAllProducts() {
//        return products;
//    }
//
//   
//    @GetMapping("/{id}")
//    public Product getProductById(@PathVariable int id) {
//        return products.stream()
//                .filter(p -> p.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }
//
//  
//    @PostMapping
//    public Product addProduct(@RequestBody Product newProduct) {
//        products.add(newProduct);
//        return newProduct;
//    }
//
//    @PutMapping("/{id}")
//    public Product updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
//        for (Product p : products) {
//            if (p.getId() == id) {
//                p.setName(updatedProduct.getName());
//                p.setPrice(updatedProduct.getPrice());
//                return p;
//            }
//        }
//        return null; // If product not found
//    }
//
//    
//    @DeleteMapping("/{id}")
//    public String deleteProduct(@PathVariable int id) {
//        boolean removed = products.removeIf(p -> p.getId() == id);
//        if (removed) {
//            return "Product with ID " + id + " deleted successfully!";
//        } else {
//            return "Product not found!";
//        }
//    }
//}
