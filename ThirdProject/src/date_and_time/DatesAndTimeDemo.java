package date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DatesAndTimeDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(10);
		
		System.out.println(today);
		System.out.println(futureDate);
		
		if(futureDate.isAfter(futureDate)) {
			System.out.println("Future date is valid");
		}
		
		Period period = Period.between(today, futureDate);
		System.out.println("Days between dates: " + period.getDays());
		
		LocalDateTime currentTimeStamp = LocalDateTime.now();
		
		System.out.println("currentTimeStamp: " + currentTimeStamp);
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		
		System.out.println("Formatted Date: " + today.format(dateFormatter));
		System.out.println("Formatted Date Time: " + currentTimeStamp.format(dateTimeFormatter));
		
		System.out.println("Original date still unchanged: " + today);
	}

}
