package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classe.Carro;

public class CarroTest {
	public static void main(String[] args) {
	
	Carro.setVelocidadeLimite(220);	
	Carro c1 = new Carro("BMW", 280);
	Carro c2 = new Carro("Audi", 275);
	Carro c3 = new Carro("Mercedes", 290);
	
	c1.imprime();
	c2.imprime();
	c3.imprime();
	
	//Passando um novo valor com o static na classe carro	
	Carro.velocidadeLimite = 220;
	
	c1.imprime();
	c2.imprime();
	c3.imprime();
	
	}
}
