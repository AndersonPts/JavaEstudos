package br.com.abc.javacore.Dsobrecargaconstrutores.classes;

public class Estudante {
	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula;

	public Estudante(String matricula, String nome, double[] notas) {
		// Inicializando os parâmetros

		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}

	public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
		this(matricula, nome, notas);// Precisa ser obirgatoriamente a primeira linha
		this.dataMatricula = dataMatricula;
	}

	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Data da Matrícula: " + this.dataMatricula);
		for (double nota : notas) {
			System.out.println("Nota: " + nota);
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

}
