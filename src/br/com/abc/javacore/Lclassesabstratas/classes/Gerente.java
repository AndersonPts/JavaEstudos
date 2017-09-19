package br.com.abc.javacore.Lclassesabstratas.classes;

public class Gerente extends Funcionario {

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String clt, double salario) {
		super(nome, clt, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void calculaSalario(){
		this.salario = salario + (salario * 0.2);
	}
	

}
