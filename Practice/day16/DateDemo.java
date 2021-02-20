package day16;

import java.time.LocalDate;

public class DateDemo {
	public static void main(String args[]){
		System.out.println(LocalDate.now());
		LocalDate today=LocalDate.now();
		System.out.println("Today date is: "+today);
		System.out.println("Year: "+today.getYear());
		System.out.println("Month: "+today.getMonth());
	System.out.println("Day: "+today.getDayOfWeek());
	
	
	
	}
}
