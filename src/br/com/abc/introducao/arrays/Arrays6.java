package br.com.abc.introducao.arrays;

public class Arrays6 {
	public static void main(String[] args) {
		//int[][] dias = new int [3][];
		//[3] -> [0][1][2](�ndices)
		
		//3 FORMAS DE INICIALIZAR UM ARRAY 
			int[] aarInt = {1,2,3};
			int[] arrInt2 = new int[3];
			int[] arrInt3 = new int[] {1,2,3};
			
		// OBS.: AS FORMAS ACIMA OBT�M A MESMA FINALIDADE
		
		/*dias[0] = new int[2];// Array de �ndice 0, com duas posi��es   -> Recebe 0 como valor padr�o
		dias[1] = new int[]{1,2,3};// Array de �ndice 1, com tr�s posi��es  -> Aqui passa valor pelo {}
		dias[2] = new int[4]; // Array de �ndice 2, com quatro posi��es -> Recebe 0 como valor padr�o
*/		
		// OUTRO FORMA POSS�VEL - PASSANDO OS VALORES
			int[][] dias = {{0,0}, {1,2,3}, {0,0,0,0}};
			
		// uTILIZAR O for each		
		for(int[] arr : dias){
			for(int num : arr){
				System.out.println(num);
			}
			//Qual � o valor da posi��o [1][2]? R.: 3 - LEMBRAR Q O �NDICE COME�A DE 0.
		}
	}

}
