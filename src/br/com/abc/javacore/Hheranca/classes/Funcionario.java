package br.com.abc.javacore.Hheranca.classes;

//Extends é quando uma classe estende de outra: Ex.: Funcionario é uma pessoa, logo, Funcionários extends de Pessoa
// Ele herda os atributos juntamente com seus métodos get e set.
// Pessoa é super Classe Pai  Funcionario -------> Pessoa(UML)
// NÃO EXISTE HERANCA MULTIPLA EM JAVA Ex.: public class Funcionario extends Pessoa, Endereco { 

public class Funcionario extends Pessoa {
	private double salario;
	
	public Funcionario(String nome){
		super(nome);
		System.out.println("Dentro do Construtor Funcionário");
	}
	
	public void imprime(){
		super.imprime();
		System.out.println("Salário: "+this.salario);
		imprimeReciboPagamento();
	}
	
	public void imprimeReciboPagamento(){
		System.out.println("Eu, "+super.nome+" recebi o pagamento no valor de "+this.salario+".");
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
