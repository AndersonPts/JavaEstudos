package br.com.abc.javacore.Sstring.test;

//StringBuilder não é uma String

public class StringBuilderTest {

	public static void main(String[] args) {
		String s = "Uma frase comum";
		s.toString();
		//O StringBuilder cria somente um objeto e troca de acordo com a passagem de texto e por isso é muito mais ráido q a String
		StringBuilder sb = new StringBuilder(16);
		sb.append("0123456789");
		System.out.println(sb.insert(2, "#####"));

	}

}
