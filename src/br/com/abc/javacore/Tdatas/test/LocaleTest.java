package br.com.abc.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
	public static void main(String[] args) {
		//ISO 639 pt - br
		
		Locale locale = new Locale("sp", "ARG");
		Locale locale2 = new Locale("pt", "PT");
		 
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.DECEMBER, 23);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(df.format(c.getTime()));
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
		System.out.println(df2.format(c.getTime()));
	}
}
