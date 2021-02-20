package day16;

import java.time.LocalDate;

public class DateDemo2 {
	public static void main(String args[]){
		LocalDate birthday=LocalDate.of(2025, 5, 23);
		LocalDate today=LocalDate.now();
		LocalDate booking=LocalDate.of(2020,3,5);
		System.out.println(booking.isBefore(birthday));
		System.out.println(booking.isAfter(birthday));
		System.out.println(booking.isBefore(booking));
		System.out.println(booking.isBefore(today));
		
	}
}
