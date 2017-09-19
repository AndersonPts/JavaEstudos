package br.com.abc.javacore.Minterfaces.classes;

/*
 * INTERFACE FUNCIONA COMOM UM CONTRATO, ONDE DIZ PARA A CLASSE O CLASSE O QUE ELA DEVE FAZER, MAS NUNCA VAI DIZER COMO
 * 
 * FUNCIONA COMO UMA CLASSE ABSOLUTAMENTE ABSTRATA
 * 
 * N�O PODE TER M�TODOS CONCRETOS
 * 
 * DIFERENTE DA CLASSE ABSTRTA QUE EXTENDS, NO INTERFACE N�S IMPLEMENTAMOS(IMPLEMENTS)
 * 
 * TODOS OS ATRIBUTOS DE UMA INTERFACE S�O CONSTANTES... EX.: public static final Tipo nome_Vari�vel;
 * 
 * QUANDO SE CRIA UMA CONSTANTE � OBRIGAT�RIO INICIALIZ�-LA.
 * 
 * 
 * */

public interface Tributavel {
	public static final double IMPOST0 = 0.2;
	public abstract void calculaImposto();// Aqui, o public abstratic � opcional, pois ele � default

}
