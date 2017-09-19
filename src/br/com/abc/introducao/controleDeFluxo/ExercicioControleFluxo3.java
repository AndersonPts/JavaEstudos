package br.com.abc.introducao.controleDeFluxo;

public class ExercicioControleFluxo3 {
	public static void main(String[] args) {
		int valor = 10;
		
		for(int num = 0; num <= valor; num ++ ){
			if(num % 2 == 0){
				System.out.println("O número "+num+" é par!");
			}else{
				System.out.println("O número "+num+" é ímpar!");
			}
		}
		
	}

}
