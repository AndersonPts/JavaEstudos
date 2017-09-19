package br.com.abc.javacore.Gassociacao.classes;

//1� Passo - Criar a classe e seus atributos
public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;

	// 3� Passo - Criar o construtor da classe e passar seus atributos
	public Professor(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;

	}

	// 4� Passo - Criar o mesmo construtor da classe, por�m vazio.
	public Professor() {

	}

	// 5� Passo: M�todo para retornar os valores.
	public void print() {
		/*System.out.println("Professor(a): " + this.nome);
		System.out.println("Especialidade: " + this.especialidade);*/

		if (seminarios != null && seminarios.length != 0) {
			System.out.println("Semin�rios participantes: ");

			for (Seminario aux : seminarios) {
				System.out.println("** " + aux.getTitulo());
			}
			return;
		}
		System.out.println("Professor n�o vinculado a nenhum semin�rio");
	}

	// 2� Criar os m�todos Getters e Setters
	public String getNome() {
		return nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

}
