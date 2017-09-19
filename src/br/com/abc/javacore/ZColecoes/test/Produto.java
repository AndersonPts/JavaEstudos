package br.com.abc.javacore.ZColecoes.test;

public class Produto {
	
		private int id;
		private String nome;
		private double preco;		
		
		public Produto(int i, String nome, double preco) {
			super();
			this.id = i;
			this.nome = nome;
			this.preco = preco;
		}
		@Override
		public String toString() {
			return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}
		public int getId() {
			return id;
		}
		public String getNome() {
			return nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}

}
