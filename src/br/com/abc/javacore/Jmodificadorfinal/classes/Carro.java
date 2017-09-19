package br.com.abc.javacore.Jmodificadorfinal.classes;

import br.com.abc.javacore.Jmodificadorfinal.test.Comprador;

public final class Carro { // Informa que essa classe não pode ser extendida
	public static final double velocidadeLimite = 250;
	private final Comprador comprador = new Comprador();
	
	private String nome;
	private String marca;
	
	//MODIFICADOR FINAL -> 
	
	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + "]";
	}
	
	public String getNome() {
		return nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Comprador getComprador() {
		return comprador;
	}	

}
