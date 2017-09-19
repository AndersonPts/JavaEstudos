package br.com.abc.javacore.Fmodificadorestatico.classe;

public class Carro {
	private String nome;
	private double velMax;
	/*
	 * Quando colocamos static antes de um tipo de variável, queremos informar que
	 * ele não pertence mais a um objeto e agora pertence à classe, conforme Exemplo abaixo 
	 */
	public static double velocidadeLimite = 240;
	
	public Carro(String nome, double velMax){
		this.nome = nome;
		this.velMax = velMax;
	}
	
	public Carro(){
		
	}
	
	public static void setVelocidadeLimite(double velocidadeLimite){
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	public static double getVelocidadeLimite(){
		return velocidadeLimite;
	}
	
	// Não se pode tornar métodos em static se eles possuírem atributos de classe
	// Ex de erro.: public static void imprime(){   ERRO EM TEMPO DE COMPILAÇÃO
	
	public void imprime(){
		
		System.out.println("Nome: "+this.nome);
		System.out.println("Velocidade Máxima: "+this.velMax);
		System.out.println("Velocidade Limite: "+velocidadeLimite);
		System.out.println("###################################");
	}
	
	public String getNome() {
		return nome;
	}
	public double getVelMax() {
		return velMax;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}
}
