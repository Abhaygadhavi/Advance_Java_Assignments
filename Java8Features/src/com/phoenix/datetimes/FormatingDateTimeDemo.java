package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatingDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		DateTimeFormatter frm=
				DateTimeFormatter .ofLocalizedDate(FormatStyle.FULL);
		String frmDate= date.format(frm);
		System.out.println("Full: "+ frmDate);

		DateTimeFormatter frm1=
				DateTimeFormatter .ofLocalizedDate(FormatStyle.MEDIUM);
		String frmDate1= date.format(frm1);
		System.out.println("Medium: "+ frmDate1);
	
		DateTimeFormatter frm2=
				DateTimeFormatter .ofPattern("MMMM dd,yyyy");
		System.out.println("custom format: "+ date.format(frm2));

		
		
	}

}
