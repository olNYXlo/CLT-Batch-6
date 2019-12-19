package testing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class GenerateTimesheet {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month in 'MM' format");
		String month = sc.next();
		System.out.println("Enter year in 'YYYY' format");
		String year = sc.next();

		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

		LinkedHashMap<String, String> timesheet = new LinkedHashMap<String, String>();
		int day = 1;
		int lastday = 0;

		// using If conditions
		if (month.contentEquals("01") || month.contentEquals("03") || month.contentEquals("05")
				|| month.contentEquals("07") || month.contentEquals("08") || month.contentEquals("10")
				|| month.contentEquals("12")) {
			lastday = 31;
		} else if (month.contentEquals("04") || month.contentEquals("06") || month.contentEquals("09")
				|| month.contentEquals("11")) {
			lastday = 30;
		} else if (month.contentEquals("02")) {
			if (Year.isLeap(Long.parseLong(year))) {
				lastday = 29;
			} else {
				lastday = 28;
			}
		} // done to set the # of days in that month

		while (day <= lastday) {
			if (day < 10) {
				ArrayList<String> data = new ArrayList<String>();
				String dd = "0" + Integer.toString(day);
				String stringDate = dd + "/" + month + "/" + year;
				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
				SimpleDateFormat findDay = new SimpleDateFormat("E");
				String dayOfWeek = findDay.format(date);
				timesheet.put(Integer.toString(day), dayOfWeek);
				data.add(Integer.toString(day));
				data.add(dayOfWeek);
				/*
				 * if (dayOfWeek.contentEquals("Sat") || dayOfWeek.contentEquals("Sun")) {
				 * timesheet.put(Integer.toString(day), dayOfWeek);
				 * 
				 * } else { timesheet.put(Integer.toString(day), ""); }
				 */
				result.add(data);
				day++;

			} // end of if case of day < 10. this is to append the prefix 0 into date

			else {
				ArrayList<String> data = new ArrayList<String>();
				String dd = Integer.toString(day);
				String stringDate = dd + "/" + month + "/" + year;
				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
				SimpleDateFormat findDay = new SimpleDateFormat("E");
				String dayOfWeek = findDay.format(date);
				timesheet.put(Integer.toString(day), dayOfWeek);
				data.add(Integer.toString(day));
				data.add(dayOfWeek);
				/*
				 * if (dayOfWeek.contentEquals("Sat") || dayOfWeek.contentEquals("Sun")) {
				 * timesheet.put(Integer.toString(day), dayOfWeek); } else {
				 * timesheet.put(Integer.toString(day), ""); }
				 */
				result.add(data);
				day++;
			} // end of else case for 10 < days <= lastday
		} // end of while loop

		/*
		 * ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		 * ArrayList<String> data = new ArrayList<String>(); int day = 1; int lastday =
		 * 0;
		 * 
		 * // using If conditions if (month.contentEquals("01") ||
		 * month.contentEquals("03") || month.contentEquals("05") ||
		 * month.contentEquals("07") || month.contentEquals("08") ||
		 * month.contentEquals("10") || month.contentEquals("12")) { lastday = 31; }
		 * else if (month.contentEquals("04") || month.contentEquals("06") ||
		 * month.contentEquals("09") || month.contentEquals("11")) { lastday = 30; }
		 * else if (month.contentEquals("02")) { if (Year.isLeap(Long.parseLong(year)))
		 * { lastday = 29; } else { lastday = 28; } } // done to set the # of days in
		 * that month
		 * 
		 * while (day <= lastday) { if (day < 10) { String dd = "0" +
		 * Integer.toString(day); String stringDate = dd + "/" + month + "/" + year;
		 * Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
		 * SimpleDateFormat findDay = new SimpleDateFormat("E"); String dayOfWeek =
		 * findDay.format(date); data.add(Integer.toString(day)); data.add(dayOfWeek);
		 * 
		 * if (dayOfWeek.contentEquals("Sat") || dayOfWeek.contentEquals("Sun")) {
		 * timesheet.put(Integer.toString(day), dayOfWeek); } else {
		 * timesheet.put(Integer.toString(day), ""); }
		 * 
		 * day++;
		 * 
		 * } // end of if case of day < 10. this is to append the prefix 0 into date
		 * 
		 * else { String dd = Integer.toString(day); String stringDate = dd + "/" +
		 * month + "/" + year; Date date = new
		 * SimpleDateFormat("dd/MM/yyyy").parse(stringDate); SimpleDateFormat findDay =
		 * new SimpleDateFormat("E"); String dayOfWeek = findDay.format(date);
		 * data.add(Integer.toString(day)); data.add(dayOfWeek);
		 * 
		 * if (dayOfWeek.contentEquals("Sat") || dayOfWeek.contentEquals("Sun")) {
		 * timesheet.put(Integer.toString(day), dayOfWeek); } else {
		 * timesheet.put(Integer.toString(day), ""); }
		 * 
		 * day++; } // end of else case for 10 < days <= lastday } // end of while loop
		 * 
		 * result.add(data);
		 * 
		 * return result; }
		 */

		System.out.println(result);
		System.out.println(result.size());
		System.out.println(result.get(0));
		System.out.println(result.get(0).get(0).getClass());
		System.out.println(result.get(0).get(1).getClass());
		System.out.println(timesheet);

	}
}
