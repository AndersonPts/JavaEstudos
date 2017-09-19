package br.com.abc.javacore.Uexpressoesregulares.test;

public class TokenTest {
	public static void main(String[] args) {
		// Utilizado para separar String utilizando algum caracter delimitador
		String str = "Anderson, Maicon, Julio, Marisa, Bianca, Fernanda, Marcio";
		//Para String utilza-se a função split
		String[] tokens = str.split(",");
		for(String arr: tokens){
			//trim -> Elimina os espaços em brancos no início e no fim de uma String
			System.out.println(arr.trim());
		}
		
	}

}
