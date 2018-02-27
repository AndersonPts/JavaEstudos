package br.com.abc.javacore.Isobrescrita.classes;

public class Pessoa {
	private String nome;
	private int idade;
	
	//SOBRESCRITA -> QUANDO VC MUDA O COMPORTAMENTO DE UM MÉTODO Q FOI DEFINIDO NA SUPER CLASSE
	//SOBRESCRITA PRECISA TER O MESMO MODIFICADOR DE ACESSO OU O MENOS RESTRITO 
	//SOBRESCRITA USADO MUITO EM POLIMORFISMO
	
	/*@Override // Anotação para informar a sobrescrita de método
	public String toString(){
		return "Nome: "+nome+ " - Idade: "+idade;
	}*/
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nome=" + nome + ", idade = " + idade;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
