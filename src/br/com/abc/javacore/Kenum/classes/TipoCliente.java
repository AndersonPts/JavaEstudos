package br.com.abc.javacore.Kenum.classes;


public enum TipoCliente {
	// EM ENUM TUDO É CONSIDERADO CONSTANTE
	PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica") ;
	// Após as constantes de enumeração  acima, é possível criar construtor

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
