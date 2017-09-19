package br.com.abc.javacore.Csobrecargametodos.test;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {
	public static void main(String[] args) {
				
		Funcionario funcionario = new Funcionario("Anderson Alves", "999.888.777.666-55", 3450, "122212-9");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.imprime();
		
		funcionario.init("Anderson Alves", "999.888.777.666-55", 3450, "122212-9");
		funcionario.imprime();
		
	}
}
