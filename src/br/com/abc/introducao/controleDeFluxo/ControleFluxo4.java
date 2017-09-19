package br.com.abc.introducao.controleDeFluxo;

public class ControleFluxo4 {
	public static void main(String[] args) {
		//While -> representação de condicional booleana
		
		int contador = 0;
		while(contador < 10){
			System.out.println(++ contador);
		}
		// NO do while, independente de ser true ou false, irá executar pelo menos uma vez
		do{
			System.out.println("dentro do do while");
		}while(contador<10);
		
		for(int i=0; i<10; i++){
			System.out.println("O valor de i é: "+i);
		}
		
	}

}
