package pack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Date {

	
	public static void main(String[] args) {
		LocalDate date3 = LocalDate.of(2017, Month.FEBRUARY, 10);
	      System.out.println("date3: " + date3);
	      
	      LocalDate sixtyfifth2017 = LocalDate.ofYearDay(2017, 65);
	      System.out.println(sixtyfifth2017);
	      
	      LocalDate date = LocalDate.now();
	      LocalDate date1 = LocalDate.parse("2017-02-05");
	      System.out.println(date1.isBefore(date));  
	      
	      LocalDate ld=LocalDate.of(2017, Month.FEBRUARY, 10);
	        System.out.println(ld);
	        
	        LocalDate sixtyfifth20171 = LocalDate.ofYearDay(2017, 65);
	        System.out.println("SixtyFifth2017="+sixtyfifth20171);
	        
	        LocalTime second =  LocalTime.ofSecondOfDay(12345);
	        System.out.println("12345th Second of day="+second);
	        
	        LocalDateTime localdatetime=LocalDateTime.of(2014, 02, 20, 12, 00);
	        System.out.println("LocalDateTime of 2014-02-20 12:00 is ="+localdatetime);
	        
	        boolean ld1=LocalDate.of(2017,2 , 5).isBefore(LocalDate.now());
	        System.out.println(ld1);
	    }


	}

