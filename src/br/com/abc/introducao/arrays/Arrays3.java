package br.com.abc.introducao.arrays;

public class Arrays3 {
	public static void main(String[] args) {
		// O Array é sempre um objeto
		
		int[] numeros  = new int[5];
		int[] numeros2 = {1,2,3,4,5};// OBS.: O tam. é 5, mas o index vai de 0 até 4.
		int[] numeros3 = new int[]{1,2,3,4,5};
		
		/*for(int i=0; i<numeros2.length; i++){
			System.out.println(numeros2[i]); //Método Tradicional
		}*/
		
		//Utilização do for each
		for(int aux : numeros2){
			System.out.println(aux);
		}
	}
}
