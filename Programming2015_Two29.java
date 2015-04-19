package programming2015.two29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static Map<String, Integer> monthMap;

	public static void main(String[] args) {
		monthMap = new HashMap<String, Integer>();
		monthMap.put("January", 1);
		monthMap.put("February", 2);
		monthMap.put("March", 3);
		monthMap.put("April", 4);
		monthMap.put("May", 5);
		monthMap.put("June", 6);
		monthMap.put("July", 7);
		monthMap.put("August", 8);
		monthMap.put("September", 9);
		monthMap.put("October", 10);
		monthMap.put("November", 11);
		monthMap.put("December", 12);
		Scanner in = new Scanner(System.in);
		Pattern pattern = Pattern
				.compile("([A-Za-z]+)\\s(\\d{1,2})\\,\\s*(\\d{4,9})");
		int n = in.nextInt();
		in.nextLine();
		Date[] dates = new Date[n * 2];
		for (int i = 0; i < n * 2; i++) {
			String line = in.nextLine();
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				Date date = new Date();
				date.month = monthMap.get(matcher.group(1));
				date.day = Integer.valueOf(matcher.group(2));
				date.year = Integer.valueOf(matcher.group(3));
				dates[i] = date;
			}
		}

		for (int i = 0; i < n * 2; i += 2) {
			int res = 0;
			for (int start = dates[i].year; start <= dates[i + 1].year; start++) {
				if (isLeapYear(start)) {
					res++;
				}
			}
			if (isLeapYear(dates[i].year) && dates[i].month > 2) {
				res--;
			}
			if (isLeapYear(dates[i + 1].year)
					&& (dates[i + 1].month < 2 || dates[i + 1].month == 2
							&& dates[i + 1].day < 29)) {
				res--;
			}
			System.out.println("Case #" + (i + 2) / 2 + ": " + res);
		}
	}

	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}

class Date {
	public int month;
	public int day;
	public int year;
}
