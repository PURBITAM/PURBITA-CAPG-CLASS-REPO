package com.capgemini.dateandtime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Iava8DateAndTimeExample {

	public static void main(String[] args) 
	{
		LocalDate ldate=LocalDate.now();
		System.out.println(ldate);
		
		LocalTime ltime=LocalTime.of(12,20);
		System.out.println(ltime);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		OffsetDateTime odt=OffsetDateTime.now();
		System.out.println(odt);
		
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zdt);
		
		Instant inst=Instant.now();
		System.out.println(inst);
		Instant inst1=inst.plus(Duration.ofMillis(5000));
		System.out.println(inst1);
		
		Duration dur=Duration.ofMillis(5000);
		System.out.println(dur);
		
		Period p=Period.between(ldate, ldate.plusDays(65));
		System.out.println(p);
		int noOfDays=p.getDays();
		System.out.println(noOfDays);
		
		Period p1=Period.of(8,5,25);
		System.out.println(p1.getDays());
		System.out.println(p1.getMonths());
		System.out.println(p1.getYears());
		
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.now().minusDays(50);
		long daysBetween=ChronoUnit.DAYS.between(date2, date1);
		System.out.println(daysBetween);
		
		long monthBw=ChronoUnit.MONTHS.between(date2, date1);
		System.out.println(monthBw);
	}
}
