package com.phoenix.streams;

import java.util.stream.IntStream;

public class PrimitiveStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream ins = IntStream.of(70,30,20,60,10);
		ins.forEach(System.out::println);
		System.out.println("sorted in ASC:");
		IntStream ins1 = IntStream.of(70,30,20,60,10);
		ins1.sorted().forEach(System.out::println);
		
		//iterate
		System.out.println("using iterator :");
		IntStream ins2 = IntStream.iterate(1,i->i+2);
		ins2.limit(10).skip(5).forEach(System.out::println);


	}

}
