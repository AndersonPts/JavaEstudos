package br.com.abc.javacore.Gassociacao.classes;

//1º Passo - Criar a classe e seus atributos
public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Professor professor;
	private Local local;

	// 3º Passo - Criar o construtor da classe e passar seus atributos
	public Seminario(String titulo) {
		super();
		this.titulo = titulo;
		/*
		 * this.alunos = alunos; this.professor = professor; this.local = local;
		 */
	}

	// 4º Passo - Criar o mesmo construtor da classe, porém vazio.
	public Seminario() {

	}

	// 5º Passo: Método para retornar os valores.
	public void print() {
		System.out.println("--------- RELATÓRIO DE SEMINÁRIOS ------------------------");
		System.out.println("Título: " + this.titulo);
		System.out.println("Professor Palestrante: " + this.professor.getNome());
		if (local != null) {
			System.out.println("Local: " + this.local.getRua() + " - Bairro: " + this.local.getBairro());
		} else {
			System.out.println("Nenhum local cadastrado para esse seminário.");
		}
		if (alunos != null && alunos.length != 0) {
			for (Aluno aux : alunos) {
				System.out.println("Nome: " + aux.getNome() + " | " + "Idade: " + aux.getIdade());
			}
		} else {
			System.out.println("Nenhum aluno cadastrado neste Seminário.");
		}
	}

	// 2º Criar os métodos Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public Local getLocal() {
		return local;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

}
