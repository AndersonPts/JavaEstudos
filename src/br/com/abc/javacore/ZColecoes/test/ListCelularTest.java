package br.com.abc.javacore.ZColecoes.test;

import java.util.ArrayList;
import java.util.List;

import br.com.abc.javacore.ZColecoes.classes.Celular;

public class ListCelularTest {
	// O sinal de == usa o espaço de memória para fazer comparação

	public static void main(String[] args) {
		Celular celular = new Celular("GalaxyS7", "123456");
		Celular celular2 = new Celular("Red MI 2", "98765");
		Celular celular3 = new Celular("LG Nexus", "09875");
		
		//Criando um array List com objeto
		List<Celular> celularList = new ArrayList<>();
		celularList.add(celular);
		celularList.add(celular2);
		celularList.add(celular3);
		
		for(Celular cel : celularList){
			System.out.println(cel.getNome());
		}
		Celular celular4 = new Celular("Galaxy S7", "123456");
		System.out.println(celularList.contains(celular4));
		
	}

}
