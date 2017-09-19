package br.com.abc.javacore.Lclassesabstratas.classes;

//Classes abastratas podem conter m�todos abstratos, onde esses m�todos n�o possui implementa��o.
// Classe abstrata nunca poder� ser inst�nciada. Nunca poder� usar um new.

//Ex.: 2 tipos de funcionarios: Gerente e vendedor.

/* DIFEREN�A ENTRE M�TODOS CONCRETO X ABSTRATO
 * 
 * CONCRETO -> Quando o m�todo ser� usado igualmente por todas as classes filhas
 * 
 * ABSTRATO -> � declarado na classe Pai e OBRIGATORIAMENTE implementado nas classes filhas de acordo com as especifica��es de casa uma.
 * */

// CLASSE ABSTRATA PODE EXTENDER DE OUTRA CLASSE ABSTRATA


public abstract class Funcionario extends Pessoa{
	protected String nome;
	protected String clt;
	protected double salario;
	
	public Funcionario(String nome, String clt, double salario) {
		super();
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}
	
	public Funcionario() {
		
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", clt=" + clt + ", salario=" + salario + "]";
	}

	public abstract void calculaSalario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClt() {
		return clt;
	}
	public void setClt(String clt) {
		this.clt = clt;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
