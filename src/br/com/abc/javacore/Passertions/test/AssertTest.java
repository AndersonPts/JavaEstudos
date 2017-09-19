package br.com.abc.javacore.Passertions.test;

public class AssertTest {
	public static void main(String[] args) {
		calculaSalario(-2000);
	}
	
	private static void calculaSalario(double salario){
		// assert -> Garante que você sempre passará o valor que está sendo aguardado - Substitui o If Else
		// Utilizado em faze de desenvolvimento
		assert (salario > 0);
		
		// É uma péssima prática utilizar o método assert em métodos privados.
		//System.out.println(salario);
		
	}

}
