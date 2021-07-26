package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalDate anyDate=LocalDate.of(2021, 7, 15);
		System.out.println(anyDate);
		
		LocalTime lt= LocalTime.now();
		System.out.println(lt);

		LocalTime ant= LocalTime.of(5, 56,24);
		System.out.println(ant);
		
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime adt= LocalDateTime.of(anyDate,ant);
		System.out.println(adt);
		
		ZonedDateTime zdt= ZonedDateTime.now();
		System.out.println(zdt);
		
		ZoneId dZ=ZoneId.systemDefault();
		System.out.println(dZ);

//		ZonedDateTime azdt= ZonedDateTime.of(anyDate,ant);
//		System.out.println(azdt);
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		zones.stream().sorted()
						.filter(z->z.startsWith("I")||z.startsWith("A"))
						.forEach(System.out::println);
		

	}

}
