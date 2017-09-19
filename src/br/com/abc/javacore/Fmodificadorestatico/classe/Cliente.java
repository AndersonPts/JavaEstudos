package br.com.abc.javacore.Fmodificadorestatico.classe;

public class Cliente {

	/*
	 * REGRA DE INICIALIZAÇÃO EM JAVA
	 * 
	 * 0 - Bloco de Inicialização é executado pela JVM
	 * 
	 * 1º -> O que estiver alocado no espaço de memória para o objeto que será
	 * criado
	 * 
	 * 2º -> Cada atributo de classe é criado e inicializado com seus valores
	 * default ou valores explicitos.
	 * 
	 * 3º -> Bloco de inicialização é executado
	 * 
	 * 4º -> O construtor é executado
	 */

	/*
	 * Para tornar o código mais eficiente, caso precise aumentar a quantidade
	 * de parcelas, utiliza-se o bloco de inicialização: Esse bloco pode ser
	 * declarado em qualquer parte do código, pois ele será exetutado antes do
	 * construtor.
	 */
	private static int[] parcelas;
	//Bloco de Inicialização
	// Se o Bloco de Inicialização for Static, ela será executada somente uma vez pela JVM
	// Se tiver mais de um Bloco de Inicialização Static, eles serão executados na ordem que aparecerem.
	
	static {
		parcelas = new int[100];
		System.out.println("Dentro do Bloco de Inicialização");
		for (int i = 1; i <= 100; i++) {
			parcelas[i-1] = i;
		}
	}
	
	public Cliente() {
		}

	public static int[] getParcelas() {
		return parcelas;
	}

	
}
