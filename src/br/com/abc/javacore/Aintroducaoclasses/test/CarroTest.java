package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Carro;

//Um dos princ�pios da OO � n�o repetir c�digo e reaproveitar

public class CarroTest {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.placa = "QWJ-1029";
		carro.modelo = "Fusca";
		carro.velocidadeMaxima = 120f;
		
		System.out.println("Seu carro "+carro.modelo+" tem a placa "+carro.placa+" e atinge a velocidade de "
				+ carro.velocidadeMaxima+" Km/h.");
		
	}

}
