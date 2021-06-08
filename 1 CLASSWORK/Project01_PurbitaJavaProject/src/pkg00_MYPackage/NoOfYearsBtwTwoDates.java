package pkg00_MYPackage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class NoOfYearsBtwTwoDates 
{
	public static void main(String[] args) 
	{
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String dt1=sdf.format(dt);
		LocalDate date1 = LocalDate.parse("1984-01-28");
		LocalDate date2 = LocalDate.parse(dt1);
		Period period = date1.until(date2);
		double yearsBetween = period.getYears();
		double mBetween = (period.getMonths());
		System.out.println("yearsBetween:"+(double)(((yearsBetween*12)+mBetween)/12));
	}
}
