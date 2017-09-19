package br.com.abc.javacore.Eblocodeinicializacao.classes;

public class Cliente {

	/*
	 * REGRA DE INICIALIZA��O EM JAVA
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
	private int[] parcelas;
	//Bloco de Inicializa��o
	{
		parcelas = new int[100];
		System.out.println("Dentro do Bloco de Inicializa��o");
		for (int i = 1; i <= 100; i++) {
			parcelas[i-1] = i;
		}
	}

	public Cliente() {
		}

	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}

}
