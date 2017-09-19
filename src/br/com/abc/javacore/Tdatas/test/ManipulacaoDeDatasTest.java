package br.com.abc.javacore.Tdatas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
			System.out.println("Domingo é o primeiro dia da semana.");
		}
		System.out.println(c);
	}

}
