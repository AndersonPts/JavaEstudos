package br.com.abc.javacore.Gassociacao.classes;

//1� Passo - Criar a classe e seus atributos
public class Aluno {
	private String nome;
	private Integer idade;
	private Seminario seminario;

	// 3� Passo - Criar o construtor da classe e passar seus atributos
	// Inializando os contrutores
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// 4� Passo - Criar o mesmo construtor da classe, por�m vazio.
	public Aluno() {

	}

	/*
	 * public void print() {
	 * 
	 * System.out.println("Nome: " + this.nome); System.out.println("Idade: " +
	 * this.idade); if (this.seminario != null) {
	 * System.out.println("Semin�rio: " + this.seminario.getTitulo()); } else {
	 * System.out.println("O aluno n�o est� inscrito em nenhum semin�rio"); } }
	 */

	// 2� Criar os m�todos Getters e Setters
	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}

}
