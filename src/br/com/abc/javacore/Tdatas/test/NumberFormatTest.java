package br.com.abc.javacore.Tdatas.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		float valor = 6545123.4567f;
		
		Locale locFR = new Locale("FR");
		Locale locFR2 = new Locale("JP");
		
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance(locFR2);
		nfa[1] = NumberFormat.getInstance(locFR);
		nfa[2] = NumberFormat.getCurrencyInstance(locFR2);
		nfa[3] = NumberFormat.getCurrencyInstance();
		
		for(NumberFormat nf : nfa){
			System.out.println(nf.format(valor));
		}
	}

}
