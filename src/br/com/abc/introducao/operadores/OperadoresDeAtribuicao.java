package br.com.abc.introducao.operadores;

public class OperadoresDeAtribuicao {
	public static void main(String[] args) {
		// Atribui��o -> =, -=, +=, *=, /=, %=
		
		int salario = 1800;
		int numero = 11;
		
		//salario = salario + 1000; -> pode ser substitu�do pela linha abaixo
		salario += 1000;
		
		//salario = salario + (int) (salario * 0.1);

		numero %= 2;
		
		System.out.println("O sal�rio �: " + salario);
		System.out.println("O resto do numero �: " + numero);
	}


}
