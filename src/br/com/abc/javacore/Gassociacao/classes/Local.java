package br.com.abc.javacore.Gassociacao.classes;

//1� Passo - Criar a classe e seus atributos
public class Local {
	private String rua;
	private String bairro;

	// 3� Passo - Criar o construtor da classe e passar seus atributos
	public Local(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}

	// 4� Passo - Criar o mesmo construtor da classe, por�m vazio.
	public Local() {

	}
	
	// 5� Passo: M�todo para retornar os valores.
	/*public void print() {
		System.out.println("Endere�o: " + this.rua);
		System.out.println("Bairro: " + this.bairro);
	}*/

	// 2� Criar os m�todos Getters e Setters
	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
