package br.com.abc.javacore.Uexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		// Como se fosse uma linguagem dentro de outra
		// Express�es Regulares - REGEX
		// Funcionalidade -> Encontrar padr�es em um determinado arquivo de texto
		
		/*METACARECTERES -> S�o caracteres que facilitam a express�o regular.
		 * Principais: 
		 * 	\d - Encontra todos os d�gitos
		 * 	\D - Emcontra todos que n�o forem d�gito
		 * 	\s - Busca espa�os em branco
		 * 	\S - Busca espa�os que n�o est�o em branco
		 * 	\w - Caracteres de palavras a-z A-z, d�gitos e _
		 *  \W - Encontra tudo que n�o for caracter de palavras
		 *  \. - Coringa 1.3 = 123, 133, 1A3, 1#3, 1 3
		 *  
		 *  ^ = Nega��o... Qualquer coisa diferente de algo passado na frente de ^
		 *  * = zero ou mais zeves
		 *  
		 *  
		 * */
		
		//String regex = "[abcB]";
		//String texto = "cafeBASE";
		
		//String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		//String texto = "fulano@fulano.com.br, #@abrao@mail.br, test120cicrano@cicrano.com, beltrano2017@beltrano.net";
		
		//Regex para buscar datas
		//String regex = "\\d{2}/\\d{2}/\\d{4}";
		//String texto = "05/10/2010 05/5/2015 1/1/01 01/05/95";// dd/MM/yyyy
		
		//Regex para NEGA��O
				String regex = "proj([^,])*";
				//Buscar todos os arquivos que tenham proj
				String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		//Para validar uma regex
		System.out.println("Email v�lido? "+"#@abrao@mail.br".matches(regex));
						
		System.out.println("TExto: "+texto);
		System.out.println("�ndice: 0123456789");
		System.out.println("Express�o: "+matcher.pattern());
		System.out.println("Posi��es encontradas");
		while(matcher.find()){
			System.out.println(matcher.start() + " "+matcher.group());
		}
	}

}
