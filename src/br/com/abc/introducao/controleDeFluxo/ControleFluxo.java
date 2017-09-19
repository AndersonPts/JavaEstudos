package br.com.abc.introducao.controleDeFluxo;

public class ControleFluxo {
	public static void main(String[] args) {
		// idade < 15 = Categoria Infantil
		// idade >= 15 && idade <= 18 juvenil
		// idade >=18 adulto
		
		int idade = 20;
		float salario = 2000;
		//boolean c = false;
		String categoria;// Precisa ser inicializada
		String status;
		
		/*if(idade < 15) {
			categoria = "Categoria Infantil.";
		}else if(idade >= 15 && idade < 18){
			categoria = "Categoria Juvenil.";
		}else{
			categoria = "Categoria Adulto.";
		}
		System.out.println(categoria);
	*/
		
	// Operadores ternários -> Substitui o if e Else
	status = idade < 18 ? "Não Adulto" : "Adulto";
	System.out.println(status);	
	
	}
}
  