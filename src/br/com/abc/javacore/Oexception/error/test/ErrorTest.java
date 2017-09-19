package br.com.abc.javacore.Oexception.error.test;

/*
 * Stack -> Pilha, onde os métodos são chamados na ordem e de acordo com as necessidades
 * 
 * stackOverflowError() -> Quando estoram a memória.
 * 
 * ERROR NÃO É UMA EXCEPTION.. É SOMENTE UM ERRO - FILHA DA CLASSE THROWABLE.
 * 
 * EXCEPTION => DUAS PALAVRAS IMPORTANTES: 
 * 
 * CHECKED (Exception)=> OBRIGADO A CRIAR UM TRATAMENTO MESMO ANTES DE RODAR O PROGRAMA (PROBLEMA DE LÓGICA DE PROGRAMAÇÃO)
 * 
 * UNCHECKED (RuntimeException)=> NÃO É OBRIGATÓRIO O TRATAMENTO, POIS NORMALMENTE É ERRO DE COMPILAÇÃO (JVM)
 * */

public class ErrorTest {
	public static void main(String[] args) {
		stackOverflowError();
	}
	
	public static void stackOverflowError(){
		stackOverflowError();		
	}

}
