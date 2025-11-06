package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	private List<Product> products= new ArrayList<>(
				Arrays.asList(
						new Product(1, "Laptop", 50000),
						new Product(2, "Mobile", 20000),
						new Product(3, "Tablet", 10000),
						new Product(4, "desktop", 40000),
						new Product(5, "Laptop", 50000),
						new Product(6, "Laptop", 50000),
						new Product(7, "Laptop", 50000)
						)
			);
	@GetMapping
	public List<Product> getProducts(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size,
			@RequestParam(defaultValue = "id") String sortBy,
			@RequestParam(defaultValue = "asc") String order
			)
	{
		Comparator<Product> comparator = switch(sortBy)
				{
		case "name" -> Comparator.comparing(Product :: getName);
		case "price"-> Comparator.comparing(Product::getPrice);
		default -> Comparator.comparing(Product::getId);
				};
		if(order.equalsIgnoreCase("dsc"))
		{
			comparator=comparator.reversed();
		}
		List<Product> sortedList=new ArrayList<>(products);
		
		int start =page*size;
		int end=Math.min(start+size, sortedList.size());
		
		
		if(start>=sortedList.size()) return Collections.emptyList();
		
		return sortedList.subList(start, end);
	}
}
