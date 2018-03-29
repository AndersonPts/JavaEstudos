package br.com.abc.javacore.Kenum.classes;

public class Cliente {
	public enum TipoPagamento {
		AVISTA, APRAZO //O TEXTO TEM QUE SER COM CAIXA ALTA
	}

	private String nome;
	private TipoCliente tipo;
	private TipoPagamento tipoPagamento;

	public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Nome= "+ nome + 
				", Tipo= " + tipo.getNome() + 
				", TipoPagamento= " + tipoPagamento +
				", Número = "+tipo.getTipo();
	}

	public String getNome() {
		return nome;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
