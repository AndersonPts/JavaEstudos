package br.com.abc.javacore.Csobrecargametodos.classes;

public class Funcionario {

	// Alto acoplamento � quando voc� deixa os seus atributos seguros dentro de
	// uma classe usando o modificador de acesso private
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	
	/*
	 * Abaixo n�s temos um exemplo de construtor..
	 * 
	 * Construtor nunca recebe retorno -> Modificador de acesso + nomeClasse()
	 * 
	 * Em construtores voc� tamb�m pode definir regras de neg�cios
	 */
	public Funcionario(String nome, String cpf, double salario, String rg){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
			
		}
	public Funcionario(){
					
		}

	/*
	 * Utiliza��o de SOBRECARGA DE M�TODOS: Pode ser usado com o mesmo nome da
	 * classe, por�m com atributos diferentes
	 * 
	 * O m�todo a ser utilizado � escolhido em tempo de compila��o de acordo com
	 * os argumetos passado.
	 */

	public void imprime() {
		System.out.println("########## Dados Funcion�rios ##############");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Sal�rio: " + this.salario);
		System.out.println("RG: " + this.rg);
	}

	public void init(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public void init(String nome, String cpf, double salario, String rg) {
		init(nome, cpf, salario);
		this.rg = rg;
	}

	/*
	 * DIFEREN�A ENTRE THIS E RETURN
	 * 
	 * THIS -> Vari�vel que faz refer�ncia para o pr�prio objeto e consegue
	 * enchegar tanto os atributos quanto os m�todos, sendo eles publicos ou
	 * n�o. Enxerga tudo que est� no objeto
	 * 
	 */
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
