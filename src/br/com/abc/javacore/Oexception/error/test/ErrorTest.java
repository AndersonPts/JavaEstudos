package br.com.abc.javacore.Oexception.error.test;

/*
 * Stack -> Pilha, onde os m�todos s�o chamados na ordem e de acordo com as necessidades
 * 
 * stackOverflowError() -> Quando estoram a mem�ria.
 * 
 * ERROR N�O � UMA EXCEPTION.. � SOMENTE UM ERRO - FILHA DA CLASSE THROWABLE.
 * 
 * EXCEPTION => DUAS PALAVRAS IMPORTANTES: 
 * 
 * CHECKED (Exception)=> OBRIGADO A CRIAR UM TRATAMENTO MESMO ANTES DE RODAR O PROGRAMA (PROBLEMA DE L�GICA DE PROGRAMA��O)
 * 
 * UNCHECKED (RuntimeException)=> N�O � OBRIGAT�RIO O TRATAMENTO, POIS NORMALMENTE � ERRO DE COMPILA��O (JVM)
 * */

public class ErrorTest {
	public static void main(String[] args) {
		stackOverflowError();
	}
	
	public static void stackOverflowError(){
		stackOverflowError();		
	}

}
