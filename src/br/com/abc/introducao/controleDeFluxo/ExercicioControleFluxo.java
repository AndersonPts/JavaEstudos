package br.com.abc.introducao.controleDeFluxo;

public class ExercicioControleFluxo {
	public static void main(String[] args) {
		double salario;
		double imposto;
		salario = 5300;
		
		if(salario < 1000){
			imposto = salario + (salario*0.05);
		
		}else if(salario >= 1000 && salario <= 2000){
			imposto = salario + (salario*0.1);
		
		}else if(salario >= 2000 && salario <= 5000){
			imposto = salario + (salario*0.15);
			
		}else{			
			imposto = salario > 5000 ? (salario + (salario*0.2)) : salario;		
		}
		System.out.println("Meu salário é de R$" + salario + " e com imposto vai para R$" + imposto);
	}

}
