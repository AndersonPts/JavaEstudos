package br.com.abc.javacore.Passertions.test;

public class AssertTest {
	public static void main(String[] args) {
		calculaSalario(-2000);
	}
	
	private static void calculaSalario(double salario){
		// assert -> Garante que voc� sempre passar� o valor que est� sendo aguardado - Substitui o If Else
		// Utilizado em faze de desenvolvimento
		assert (salario > 0);
		
		// � uma p�ssima pr�tica utilizar o m�todo assert em m�todos privados.
		//System.out.println(salario);
		
	}

}
