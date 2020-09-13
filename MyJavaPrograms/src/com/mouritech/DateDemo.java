package com.mouritech;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate locadate=LocalDate.now();
//		DateFormat
//		SimpleDateFormat
		System.err.println(locadate);
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yy");
		String format = locadate.format(dateTimeFormatter);
		System.err.println(format);
	    LocalDateTime ldt=LocalDateTime.now();
	    System.err.println(ldt);
	    LocalTime lt=LocalTime.now();
	   ///s System.err.println(lt.toStri);

	}

}
