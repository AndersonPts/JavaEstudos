package br.com.abc.javacore.Csobrecargametodos.classes;

public class Funcionario {

	// Alto acoplamento é quando você deixa os seus atributos seguros dentro de
	// uma classe usando o modificador de acesso private
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	
	/*
	 * Abaixo nós temos um exemplo de construtor..
	 * 
	 * Construtor nunca recebe retorno -> Modificador de acesso + nomeClasse()
	 * 
	 * Em construtores você também pode definir regras de negócios
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
	 * Utilização de SOBRECARGA DE MÉTODOS: Pode ser usado com o mesmo nome da
	 * classe, porém com atributos diferentes
	 * 
	 * O método a ser utilizado é escolhido em tempo de compilação de acordo com
	 * os argumetos passado.
	 */

	public void imprime() {
		System.out.println("########## Dados Funcionários ##############");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Salário: " + this.salario);
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
	 * DIFERENÇA ENTRE THIS E RETURN
	 * 
	 * THIS -> Variável que faz referência para o próprio objeto e consegue
	 * enchegar tanto os atributos quanto os métodos, sendo eles publicos ou
	 * não. Enxerga tudo que está no objeto
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
