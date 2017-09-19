package br.com.abc.javacore.VresourseBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

// Internacionalização de código

public class ResourseBundleTest { // Caso queira modificar o idioma das mensagens

	public static void main(String[] args) {
		//System.out.println(Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		//rb.getString("hello");
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		System.out.println("\n");
		
		rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));

	}

}
