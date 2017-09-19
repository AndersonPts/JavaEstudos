package br.com.abc.introducao.arrays;

public class Arrays6 {
	public static void main(String[] args) {
		//int[][] dias = new int [3][];
		//[3] -> [0][1][2](índices)
		
		//3 FORMAS DE INICIALIZAR UM ARRAY 
			int[] aarInt = {1,2,3};
			int[] arrInt2 = new int[3];
			int[] arrInt3 = new int[] {1,2,3};
			
		// OBS.: AS FORMAS ACIMA OBTÉM A MESMA FINALIDADE
		
		/*dias[0] = new int[2];// Array de índice 0, com duas posições   -> Recebe 0 como valor padrão
		dias[1] = new int[]{1,2,3};// Array de índice 1, com três posições  -> Aqui passa valor pelo {}
		dias[2] = new int[4]; // Array de índice 2, com quatro posições -> Recebe 0 como valor padrão
*/		
		// OUTRO FORMA POSSÍVEL - PASSANDO OS VALORES
			int[][] dias = {{0,0}, {1,2,3}, {0,0,0,0}};
			
		// uTILIZAR O for each		
		for(int[] arr : dias){
			for(int num : arr){
				System.out.println(num);
			}
			//Qual é o valor da posição [1][2]? R.: 3 - LEMBRAR Q O ÍNDICE COMEÇA DE 0.
		}
	}

}
