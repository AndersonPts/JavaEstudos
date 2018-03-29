package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Gina");
		Endereco end = new Endereco();
		
		//p.setNome("Gina");
		p.setCpf("111.222.333.444-55");
		end.setRua("Dom Pedro, 45");
		end.setBairro("Centro");
		p.setEndereco(end);
		p.imprime();
		System.out.println("========================================");
		
		Funcionario f = new Funcionario("Augusto");
		//f.setNome("Augusto");
		f.setCpf("555.444.333.222-11");
		f.setSalario(15000);
		f.setEndereco(end);
		f.imprime();
		
				
	}

}
