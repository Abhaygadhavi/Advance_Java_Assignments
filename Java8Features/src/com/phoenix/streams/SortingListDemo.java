package com.phoenix.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.models.Product;

public class SortingListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> prodList= new ArrayList<Product>();
		prodList.add(new Product(1004, "Mobile", "Lenovo", 45000));
		prodList.add(new Product(1005, "Monitor", "Onida", 6500));
		prodList.add(new Product(1003, "Fridge", "Haer", 25000));
		prodList.add(new Product(1001, "Laptop", "Whirlpool", 5000));
		prodList.add(new Product(1002, "Mobile", "Apple", 105000));

		Collections.sort(prodList);
		
		prodList.forEach(System.out::println);
		
		//java8
		prodList.sort(Comparator.naturalOrder());
		prodList.forEach(System.out::println);

		//reversed order
		prodList.sort(Comparator.reverseOrder());
		prodList.forEach(System.out::println);

		//using stream
		System.out.println("sorting through stream ASC");
		prodList.stream().sorted().forEach(System.out::println);
	
		System.out.println("sorting through stream DESC");
		prodList.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
	
		//sorting according to productName
		System.out.println("sorting according to productName");
		prodList.sort(Comparator.comparing(Product::getName));
		prodList.forEach(System.out::println);

		System.out.println("sorting according to productName DESC");
		prodList.sort(Comparator.comparing(Product::getName).reversed());
		prodList.forEach(System.out::println);
		
		//sorting according to brandName
		System.out.println("sorting according to productBrand:");
		prodList.sort(Comparator.comparing(Product::getBrand));
		prodList.forEach(System.out::println);

		System.out.println("sorting according to productBrand DESC");
		prodList.sort(Comparator.comparing(Product::getBrand).reversed());
		prodList.forEach(System.out::println);
		
		//sorting according to price
		System.out.println("sorting according to productPrice:");
		prodList.sort(Comparator.comparing(Product::getPrice));
		prodList.forEach(System.out::println);

		System.out.println("sorting according to productPrice DESC");
		prodList.stream().sorted(Comparator.comparing(Product::getPrice).reversed())
						.forEach(System.out::println);
		//sort according to name then brand
		System.out.println("sorting according to productname and productbrand ASC");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand))
				.forEach(System.out::println);
		System.out.println("sorting according to productname ASC and productbrand DESC");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName)
						.thenComparing(Product::getBrand,(b1,b2)->b2.compareTo(b1)))
				.forEach(System.out::println);
		System.out.println("sorting according to productname DESC and productbrand DESC");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName)
						.thenComparing(Product::getBrand).reversed())
				.forEach(System.out::println);
	}

}
