package com.phoenix.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.phoenix.models.Product;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> prodList= new ArrayList<Product>();
		prodList.add(new Product(1004, "Laptop", "Lenovo", 45000));
		prodList.add(new Product(1005, "Monitor", "Onida", 6500));
		prodList.add(new Product(1003, "Fridge", "Haer", 25000));
		prodList.add(new Product(1001, "Microwave", "Whirlpool", 5000));
		prodList.add(new Product(1002, "Mobile", "Apple", 105000));

//		Stream<Product> prodStream=prodList.stream();
//		Stream<Product> filteredStream=prodStream.filter(p->p.getPrice()>20000.00f);
//		List<Product> filteredProductList = filteredStream.collect(Collectors.toList());
//		filteredProductList.forEach(p->System.out.println(p));
		
		//stream pipeline
		List<Product> products=prodList.stream()
										.filter(p->p.getPrice()>20000) //intermediate
										.collect(Collectors.toList()); //terminal
		products.forEach(System.out::println);

		
		List<Float> prodPrice=prodList.stream()
				.filter(p->p.getPrice()>20000) //intermediate stream operation
				.map(product->product.getPrice())//intermediate stream operation
				.collect(Collectors.toList()); //terminal
		prodPrice.forEach(System.out::println);
	
		long prodCount=prodList.stream().count();
		System.out.println("No of products: "+ prodCount);
		
		Product prodMaxPrice=prodList.stream()
										.max((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1)
										.get();
		System.out.println("Max priced product is: "+ prodMaxPrice);
		
		Product prodMinPrice=prodList.stream()
				.min((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1)
				.get();
		System.out.println("Min priced product is: "+ prodMinPrice);
	
		float maxPrice = prodList.stream()
				.map(p->p.getPrice())
				.max((p1,p2)->p1>p2?1:-1)
				.get();
		System.out.println("Max price of product is: "+ maxPrice);

		float minPrice = prodList.stream()
				.map(p->p.getPrice())
				.min((p1,p2)->p1>p2?1:-1)
				.get();
		System.out.println("Min price of product is: "+ minPrice);
		
		
	}

}
