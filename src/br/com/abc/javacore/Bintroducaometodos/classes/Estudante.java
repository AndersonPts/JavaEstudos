package br.com.abc.javacore.Bintroducaometodos.classes;

/*
 * Crie uma classe estudante com os seguintes atributos:
 * + nomes, idade, notas(3 notas)
 * 
 * Crie um método para impromir os dados e tirar a média desse aluno e caso a média seja maior que 6,
 * imprimir aprovado, senão reprovado
 * */
public class Estudante {
	private String nome;
	private int idade;
	private double notas[];
	private boolean aprovado;
	
/*	Encapsulamento -> Métodos Getters and setters
 * 		** Auxiliam no tipo de acesso,
 * 		** Quando é private auxilia na proteção dos atributos da classe de origem.
 */
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {		
			this.idade = idade;
		}
	

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public boolean isAprovado() {
		return this.aprovado;
	}

	public void imprime() {

		System.out.println("Estudante: " + this.nome);
		if (idade < 0) {
			System.out.println("Idade inválida.");
		} else{
		System.out.println("Idade: " + this.idade);
		}
		for (double aux : notas) {
			System.out.println("Nota: " + aux);
		}
	}

	public void soma() {

		// double soma;
		double media = 0;

		// soma = notas[0]+notas[1]+notas[2];
		for (double aux : notas) {
			media += aux; // Recebe as notas atraves do aux
		}
		media /= notas.length;

		if (media < 4) {
			this.aprovado = false;
			System.out.println("Você está reprovado.\n");
		} else if (media > 4 && media < 6) {
			System.out.println("Prova Final.\n");
		} else if (media >= 6) {
			this.aprovado = true;
			System.out.println("Aprovado!\n");
		}
	}

}
