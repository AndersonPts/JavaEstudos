package br.com.abc.javacore.Hheranca.classes;

// Herança é utilizado em Java por basicamente 2 motivos:
// 1º -> Reaproveitamento de código
// 2º -> Para utilizar o Polimorfismo
// Modificador de Acesso protected -> Pode ser acessado de dentro do próprio pacote ou classes filhas
// TODA CLASSE EXTENDS DE OBJECT , ele fica implicito na construção da classe.

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	{
		System.out.println("Bloco de Inicialização Estático");
	}
	{
		System.out.println("Bloco de Inicialização 1");
	}
	{
		System.out.println("Bloco de Inicialização 2");
	}
			
	public void imprime(){
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Rua: "+this.endereco.getRua());
		System.out.println("Bairro: "+this.endereco.getBairro());
	}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	public Pessoa(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
