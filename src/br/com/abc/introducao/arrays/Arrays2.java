package br.com.abc.introducao.arrays;

public class Arrays2 {
	public static void main(String[] args) {
		
		// byte, short, int, long, float, double -> Valor padr�o = 0
		// char 'u0000' ' '
		// boolean -> false
		// reference -> null
		
		String [] nomes = new String[3]; // O valor padr�o de int no array � = zero.
		
		nomes[0] = "Naruto";
		nomes[1] = "Goku";
		nomes[2] = "Luffy";
		
		for(int i=0; i<=nomes.length; i++){
			System.out.println("#*Sistema de Identifica��o*#");
			System.out.println((i+1) + ": " + nomes[i]);
		}
	}
	
}
