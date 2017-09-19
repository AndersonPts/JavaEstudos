package br.com.abc.javacore.Gassociacao.classes;

//1º Passo - Criar a classe e seus atributos
public class Local {
	private String rua;
	private String bairro;

	// 3º Passo - Criar o construtor da classe e passar seus atributos
	public Local(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}

	// 4º Passo - Criar o mesmo construtor da classe, porém vazio.
	public Local() {

	}
	
	// 5º Passo: Método para retornar os valores.
	/*public void print() {
		System.out.println("Endereço: " + this.rua);
		System.out.println("Bairro: " + this.bairro);
	}*/

	// 2º Criar os métodos Getters e Setters
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
