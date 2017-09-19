package br.com.abc.javacore.Npolimorfismo.classes;

public abstract class Funcionario {
	private String nome;
	protected double salario;	
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}	
	
	public abstract void calcularPagamento();
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}

	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
