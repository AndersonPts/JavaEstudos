package br.com.abc.javacore.ZColecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		//O m�todo abaixo cria um array de strings
		//NUNCA pode criar cole��es com tipos primitivos. Pq tipos primitivos n�o existem m�todos
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Anderson");
		nomes.add("DevDojo");
		
		//Para listar os nomes cadastrados, utiliza-se o foreach
		for(String nome: nomes){
			System.out.println(nome);			
		}
		nomes.add("Alves");
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}

}
