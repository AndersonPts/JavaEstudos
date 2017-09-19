package br.com.abc.javacore.Minterfaces.classes;

/*
 * INTERFACE FUNCIONA COMOM UM CONTRATO, ONDE DIZ PARA A CLASSE O CLASSE O QUE ELA DEVE FAZER, MAS NUNCA VAI DIZER COMO
 * 
 * FUNCIONA COMO UMA CLASSE ABSOLUTAMENTE ABSTRATA
 * 
 * NÃO PODE TER MÉTODOS CONCRETOS
 * 
 * DIFERENTE DA CLASSE ABSTRTA QUE EXTENDS, NO INTERFACE NÓS IMPLEMENTAMOS(IMPLEMENTS)
 * 
 * TODOS OS ATRIBUTOS DE UMA INTERFACE SÃO CONSTANTES... EX.: public static final Tipo nome_Variável;
 * 
 * QUANDO SE CRIA UMA CONSTANTE É OBRIGATÓRIO INICIALIZÁ-LA.
 * 
 * 
 * */

public interface Tributavel {
	public static final double IMPOST0 = 0.2;
	public abstract void calculaImposto();// Aqui, o public abstratic é opcional, pois ele é default

}
