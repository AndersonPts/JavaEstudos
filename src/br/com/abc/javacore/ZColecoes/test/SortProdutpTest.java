package br.com.abc.javacore.ZColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortProdutpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto(1, "Notebook", 2000.0);
		Produto produto2 = new Produto(2, "DVD", 150.0);
		Produto produto3 = new Produto(1, "Som", 723.0);
		Produto produto4 = new Produto(1, "Cafeteira", 547.0);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		//Collections.sort(produtos);
		
		for (Produto produto : produtos) {
			System.out.println(produto);
			CONTINUAR DA AULA 122 - IRE DAR UMA PAUSA E PULAR PARA A AULA 140 ATÉ 155
		}
		
	}

}
