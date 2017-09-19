package br.com.abc.introducao.arrays;

public class Arrays1 {
	public static void main(String[] args) {
		// Criando Arrays de inteiros
		int[] idades = new int[3];// Recomendado colocar as chaves antes da variável.
		//O new somente é utilizado para criar arrays.
		// Como preencher o Array de idades:
		
		idades[0] = 20;
		idades[1] = 15;
		idades[2] = 45;
		
		System.out.println("Idade 1 = " + idades[0]);
		System.out.println("Idade 2 = " + idades[1]);
		System.out.println("Idade 3 = " + idades[2]);
		
	}

}
