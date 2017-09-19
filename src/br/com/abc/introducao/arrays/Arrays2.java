package br.com.abc.introducao.arrays;

public class Arrays2 {
	public static void main(String[] args) {
		
		// byte, short, int, long, float, double -> Valor padrão = 0
		// char 'u0000' ' '
		// boolean -> false
		// reference -> null
		
		String [] nomes = new String[3]; // O valor padrão de int no array é = zero.
		
		nomes[0] = "Naruto";
		nomes[1] = "Goku";
		nomes[2] = "Luffy";
		
		for(int i=0; i<=nomes.length; i++){
			System.out.println("#*Sistema de Identificação*#");
			System.out.println((i+1) + ": " + nomes[i]);
		}
	}
	
}
