package br.com.abc.javacore.Bintroducaometodos.classes;


//Crie os seguintes atributos para essa classe:
// Nome, Matricula, RG e CPF
// Crie uma classe de teste para preencher e imprimir  os dados deste professor.
public class Professor {
	
	public String nome;
	public String matricula;
	public String rg;
	public String cpf;	
	
	/*// O aux faz referência dos objetos passados pelo ProfessorTest Ex.: prof e prof2
	public void imprime(Professor aux){
		System.out.println("=== DADOS PROFESSOR ===");
		System.out.println("Nome: "+aux.nome);
		System.out.println("Matrícula: "+aux.matricula);
		System.out.println("RG: "+aux.rg);
		System.out.println("CPF: "+aux.cpf+"\n");
		aux.nome = "MAriana";
		System.out.println(aux.nome);
	}
	
	UTILIZAR A FUNÇÃO THIS, PARA NÃO PRECISAR PASSAR O VALOR POR PARÂMETRO
	
	this -> Utilizado quando vc quer pegar os valores de dentro dos objetos.
*/
	
	public void imprime(){
		System.out.println("=== DADOS PROFESSOR ===");
		System.out.println("Nome: "+ this.nome);
		System.out.println("Matrícula: "+ this.matricula);
		System.out.println("RG: "+ this.rg);
		System.out.println("CPF: "+ this.cpf+"\n");
	}
}