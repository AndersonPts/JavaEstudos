package br.com.abc.javacore.ZZCjdbc.test;

import java.util.Scanner;

public class TesteCRUD {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int op;
		while(true){
			menu();
			op = teclado.nextInt();
			if(op==0){
				System.out.println("Saindo do sistema.");
				break;
			}
		}
	}
	private static void menu(){		
		System.out.println("Digite a opção para começar");
		System.out.println("1. Inserir Comprador");
		System.out.println("2. Atualizar Comprador");
		System.out.println("3. Listar todos os compradores");
		System.out.println("4. Buscar comprador por nome");
		System.out.println("5. Deletar");
		System.out.println("0. Sair");
	}

}
CONTINUAR DA AULA 154