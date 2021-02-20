package day16;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class AgeCheck {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(1998,10,01);
		Period period=Period.between(birthday, today);
		System.out.println(period.getYears()+"Year: "+period.getMonths()+"Month: "+period.getDays()+"Day:");
}
}