package br.com.abc.javacore.Lclassesabstratas.test;

import br.com.abc.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
	public static void main(String[] args) {
		Vendedor v = new Vendedor("Camila", "201786", 1500, 5000);
		Gerente g = new Gerente("Ana", "20153-9", 3500);;
		g.calculaSalario();	
		v.calculaSalario();	
		System.out.println(g);
		System.out.println(v);
		
	}

}
