package br.com.abc.javacore.Uexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		// Como se fosse uma linguagem dentro de outra
		// Expressões Regulares - REGEX
		// Funcionalidade -> Encontrar padrões em um determinado arquivo de texto
		
		/*METACARECTERES -> São caracteres que facilitam a expressão regular.
		 * Principais: 
		 * 	\d - Encontra todos os dígitos
		 * 	\D - Emcontra todos que não forem dígito
		 * 	\s - Busca espaços em branco
		 * 	\S - Busca espaços que não estão em branco
		 * 	\w - Caracteres de palavras a-z A-z, dígitos e _
		 *  \W - Encontra tudo que não for caracter de palavras
		 *  \. - Coringa 1.3 = 123, 133, 1A3, 1#3, 1 3
		 *  
		 *  ^ = Negação... Qualquer coisa diferente de algo passado na frente de ^
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
		
		//Regex para NEGAÇÃO
				String regex = "proj([^,])*";
				//Buscar todos os arquivos que tenham proj
				String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		//Para validar uma regex
		System.out.println("Email válido? "+"#@abrao@mail.br".matches(regex));
						
		System.out.println("TExto: "+texto);
		System.out.println("Índice: 0123456789");
		System.out.println("Expressão: "+matcher.pattern());
		System.out.println("Posições encontradas");
		while(matcher.find()){
			System.out.println(matcher.start() + " "+matcher.group());
		}
	}

}
