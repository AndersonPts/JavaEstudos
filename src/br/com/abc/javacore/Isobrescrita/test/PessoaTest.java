package br.com.abc.javacore.Isobrescrita.test;

import br.com.abc.javacore.Isobrescrita.classes.Pessoa;

public class PessoaTest {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Andy");
		pessoa.setIdade(32);
		
		System.out.println(pessoa);
	}

}
