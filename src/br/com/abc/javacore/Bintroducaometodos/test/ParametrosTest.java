package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

public class ParametrosTest {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		int num1 = 5;
		int num2 = 10;
		
		calc.alteraDoisNumeros(num1, num2);
		System.out.println("Dentro do Teste");
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		
	}

}
