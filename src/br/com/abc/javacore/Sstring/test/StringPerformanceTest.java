package br.com.abc.javacore.Sstring.test;

public class StringPerformanceTest {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatString(30000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio) + " ms.");
		
		inicio = System.currentTimeMillis();
		concatStringBuilder(100000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio) + " ms.");
		
		inicio = System.currentTimeMillis();
		concatStringBuffer(100000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio) + " ms.");

	}

	public static void concatString(int tam) {
		String string = " ";
		for (int i = 0; i < tam; i++) {
			string += i;
		}
	}

	public static void concatStringBuilder(int tam) {
		StringBuilder sb = new StringBuilder(tam);
		for (int i = 0; i < tam; i++) {
			sb.append(i);

		}
	}
	
	//Não é utilizado em ambiente multithread
	public static void concatStringBuffer(int tam) {
		StringBuilder sb = new StringBuilder(tam);
		for (int i = 0; i < tam; i++) {
			sb.append(i);

		}
	}
}
