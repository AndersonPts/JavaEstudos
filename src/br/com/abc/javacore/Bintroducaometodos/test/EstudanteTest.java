package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante estud1 = new Estudante();
		
		estud1.setNome("Anderson");
		estud1.setIdade(17);
		estud1.setNotas(new double[]{7.6,8.4,6});
		estud1.imprime();
		estud1.soma();
		
		Estudante estud2 = new Estudante();
		estud2.setNome("Fernando");
		estud2.setIdade(20);
		estud2.setNotas(new double[]{5.6,5.4,4});
		estud2.imprime();
		estud2.soma();
				
	}
}
