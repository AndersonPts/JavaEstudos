package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Carro;

//Um dos princípios da OO é não repetir código e reaproveitar

public class CarroTest {
	public static void main(String[] args) {
		Carro carro = new Carro();
		Carro Peugeot = new Carro();
		
		carro.placa = "QWJ-1029";
		carro.modelo = "Fusca";
		carro.velocidadeMaxima = 120f;
		
		Peugeot.modelo = "Peugeot 207 SW XRS Sport";
		Peugeot.placa = "HJU-9034";
		Peugeot.velocidadeMaxima = 125f;
		
		System.out.println("Seu carro "+carro.modelo+" tem a placa "+carro.placa+" e atinge a velocidade de "
				+ carro.velocidadeMaxima+" Km/h.");
		
		System.out.println("Seu carro "+Peugeot.modelo+" tem a placa "+Peugeot.placa+" e atinge a velocidade de "
				+ Peugeot.velocidadeMaxima+" Km/h.");
		
	}

}
