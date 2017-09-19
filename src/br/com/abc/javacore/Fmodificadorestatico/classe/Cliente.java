package br.com.abc.javacore.Fmodificadorestatico.classe;

public class Cliente {

	/*
	 * REGRA DE INICIALIZA��O EM JAVA
	 * 
	 * 0 - Bloco de Inicializa��o � executado pela JVM
	 * 
	 * 1� -> O que estiver alocado no espa�o de mem�ria para o objeto que ser�
	 * criado
	 * 
	 * 2� -> Cada atributo de classe � criado e inicializado com seus valores
	 * default ou valores explicitos.
	 * 
	 * 3� -> Bloco de inicializa��o � executado
	 * 
	 * 4� -> O construtor � executado
	 */

	/*
	 * Para tornar o c�digo mais eficiente, caso precise aumentar a quantidade
	 * de parcelas, utiliza-se o bloco de inicializa��o: Esse bloco pode ser
	 * declarado em qualquer parte do c�digo, pois ele ser� exetutado antes do
	 * construtor.
	 */
	private static int[] parcelas;
	//Bloco de Inicializa��o
	// Se o Bloco de Inicializa��o for Static, ela ser� executada somente uma vez pela JVM
	// Se tiver mais de um Bloco de Inicializa��o Static, eles ser�o executados na ordem que aparecerem.
	
	static {
		parcelas = new int[100];
		System.out.println("Dentro do Bloco de Inicializa��o");
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
