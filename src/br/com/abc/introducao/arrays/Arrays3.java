package br.com.abc.introducao.arrays;

public class Arrays3 {
	public static void main(String[] args) {
		// O Array � sempre um objeto
		
		int[] numeros  = new int[5];
		int[] numeros2 = {1,2,3,4,5};// OBS.: O tam. � 5, mas o index vai de 0 at� 4.
		int[] numeros3 = new int[]{1,2,3,4,5};
		
		/*for(int i=0; i<numeros2.length; i++){
			System.out.println(numeros2[i]); //M�todo Tradicional
		}*/
		
		//Utiliza��o do for each
		for(int aux : numeros2){
			System.out.println(aux);
		}
	}
}
