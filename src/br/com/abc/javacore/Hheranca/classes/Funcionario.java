package br.com.abc.javacore.Hheranca.classes;

//Extends � quando uma classe estende de outra: Ex.: Funcionario � uma pessoa, logo, Funcion�rios extends de Pessoa
// Ele herda os atributos juntamente com seus m�todos get e set.
// Pessoa � super Classe Pai  Funcionario -------> Pessoa(UML)
// N�O EXISTE HERANCA MULTIPLA EM JAVA Ex.: public class Funcionario extends Pessoa, Endereco { 

public class Funcionario extends Pessoa {
	private double salario;
	
	public Funcionario(String nome){
		super(nome);
		System.out.println("Dentro do Construtor Funcion�rio");
	}
	
	public void imprime(){
		super.imprime();
		System.out.println("Sal�rio: "+this.salario);
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
