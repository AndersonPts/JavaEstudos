package br.com.abc.introducao.operadores;

public class Operadores {
	public static void main(String[] args) {
		int numeroInteiro = 20;
		long numeroLong = 200000L;
		
		double numeroDouble = 10d;
		float numeroFloat = 20f;
		numeroFloat = (float) numeroDouble;
		int resto = 20%2;
		System.out.println("Resto da divisão: " + resto);
		System.out.println("Esse inteiro é: "+ numeroInteiro);
		System.out.println("Esse Long é: "+ numeroLong);
		System.out.println("Esse Float é: "+ numeroFloat );
	}

}
