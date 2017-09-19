package br.com.abc.javacore.Minterfaces.classes;

/*
 * INTERFACE(é um...) FUNCIONA COMOM UM CONTRATO, ONDE DIZ PARA A CLASSE O CLASSE O QUE ELA DEVE FAZER, MAS NUNCA VAI DIZER COMO
 * 
 * FUNCIONA COMO UMA CLASSE ABSOLUTAMENTE ABSTRATA
 * 
 * NÃO PODE TER MÉTODOS CONCRETOS
 * 
 * FORMA QUE O JAVA ENCONTROU DE CONTORNAR O FATO DE QUE NÃO SE PODE TER MULTIPLAS HERANÇAS
 * */
public class Produto implements Tributavel, Transportavel {
	private String nome;
	private double peso;
	private double preco;
	private double precoFinal;
	private double valorFrete;

	public Produto(String nome, double peso, double preco) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	public Produto() {

	}

	@Override
	public void calculaImposto() {
		// TODO Auto-generated method stub
		precoFinal = this.preco + (this.preco * IMPOST0);
	}

	@Override
	public void calculaFrete() {
		// TODO Auto-generated method stub
		this.valorFrete = this.preco / peso * 0.1;
	}


	@Override
	public String toString() {
		return "Nome=" + nome + " | peso=" + peso + " | preco=" + preco + " | Preço Final c/ Imposto=" + precoFinal
				+ " | valorFrete=" + valorFrete;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public double getValorFrete() {
		return valorFrete;
	}	

}
