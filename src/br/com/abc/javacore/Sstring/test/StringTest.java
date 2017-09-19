package br.com.abc.javacore.Sstring.test;

public class StringTest {

	// String é IMUTÁVEL
	public static void main(String[] args) {
		String nome = "Wilian";
		nome = nome.concat(" Suane");
		String nome2 = "Willian";
		String nome3 = new String("Catarina");
				
		String teste = "Goku";
		String teste2 = "goku";
		String teste3 = "ABCabcabC";
		String teste4 = "Paralelepipedo";
		String teste5 = "0123456789";
		String teste6 = "       Fulano          ";
		//charAt -> Retorna a letra conforme a posição em uma palavra. Lembrando q o índice começa do 0.
		System.out.println(teste.charAt(2));
		// Compara duas Strings - Case Sensitive influencia.
		System.out.println(teste.equals(teste2));
		// Compara duas Strings ignorando o Case Sensitive
		System.out.println(teste.equalsIgnoreCase(teste2));
		//Saber o tamanho de uma String
		System.out.println(teste.length());
		//Substitui partes de uma String
		System.out.println(teste3.replace('a', 'p'));
		// Passar Um String toda para Maiúscula ou Minúscula...
		System.out.println(teste4.toLowerCase());
		System.out.println(teste4.toUpperCase());
		// SubString -> Quebra uma String e pega uma parte dela.
		System.out.println(teste5.substring(0, 4));
		// trim -> Remove todos os espaços do COMEÇO e FIM de uma String 
		System.out.println(teste6.trim());
		

	}

}
