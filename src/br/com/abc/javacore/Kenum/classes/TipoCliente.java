package br.com.abc.javacore.Kenum.classes;


public enum TipoCliente {
	// EM ENUM TUDO � CONSIDERADO CONSTANTE
	PESSOA_FISICA(1, "Pessoa F�sica"), PESSOA_JURIDICA(2, "Pessoa Jur�dica") ;
	// Ap�s as constantes de enumera��o  acima, � poss�vel criar construtor

	private int tipo;
	private String nome;

	private TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	// constant specific class body
	
	public int getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}	

}
