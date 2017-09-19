package br.com.abc.introducao.arrays;
// CRIAÇÃO DE ARRAYS MULTIDIMENSIONAIS

public class Arrays5 {
	public static void main(String[] args) {
		int[][] dias = new int[2][2];
		//O primeiro array referencia outro array
		// O último Array é que recebe os valores
		
		dias [0][0] = 30;
		dias [0][1] = 31;
		dias [1][0] = 29;
		dias [1][1] = 28;
		
		/*for(int i=0;i<dias.length;i++){
			//System.out.println(dias[i]); IMPRIME SOMENTE O LOCAL DE MEMÓRIA
			for(int j=0;j<dias[i].length;j++){
				System.out.println(dias[i][j]);
			}
		}*/
		
		// Utilizando for each em Arrays multidimensionais
		for(int[] ref : dias){//Aqui recebe as referências - seria como o i
			for(int dia : ref){ // Aqui ele acessa os valores - seria como o j
				System.out.println(dia); // Retorna os valores encontrados
			}
		}
		
	}

}
