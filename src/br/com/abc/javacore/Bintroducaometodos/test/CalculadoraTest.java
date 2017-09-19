package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		System.out.println("Somando...");
		Calculadora.somaDoisNumeros();

		System.out.println("Subtraindo...");
		Calculadora.subtraiDoisNumeros();

		System.out.println("Multiplicando...");
		Calculadora.multiplicaDoisNumeros(5, 5);// Passando os argumentos para os
											// parametros num1 e num2

		System.out.println("Dividindo..");
		Calculadora.divideDoisNumeros(20, 10);

		/*
		 * A partir do JAVA 5 foi criado um tipo novo de par�metros: O var
		 * arqs[]
		 */
		int[] numeros = { 1, 2, 3, 4, 5 };

		Calculadora.somaArray(numeros);

		Calculadora.somaVarArgs(1, 2, 3, 4, 5);
		Calculadora.somaVarArgs(5, 1, 9, 3, 7);
	}
	// LEMBRETE: BREAK S� PODE SER USADO EM ESTRUTURA DE REPETI��O OU CLASSE COM
	// RETORNO VOID

}
