package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

public class SeminarioTest {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Anderson Alves", 27);
		Aluno aluno2 = new Aluno("Maicon Xavier", 30);
		Seminario seminario1 = new Seminario("Curso Java Completo");
		Seminario seminario2 = new Seminario("Curso SQL COMPLETO");
		Professor prof1 = new Professor("Mariana G. Pereira", "Quimica Aplicada");
		Professor prof2 = new Professor("Anderson Alves", "Conceitos de Desenvolvimento Web");
		Local local1 = new Local("Rua das Araras, 543", "Vila Norte");
		Local local2 = new Local("Rua da Candelária, 93", "Centro");

		seminario1.setProfessor(prof1);		
		seminario2.setProfessor(prof2);
		seminario1.setLocal(local1);
		seminario2.setLocal(local2);
		seminario1.setAlunos(new Aluno[] {aluno1, aluno2});
		//seminario2.setAlunos(new Aluno[] {aluno1});

		Seminario[] seminario1Array = new Seminario[2];
		seminario1Array[0] = seminario1;
		seminario1Array[1] = seminario2;
		prof1.setSeminarios(seminario1Array);
		prof2.setSeminarios(seminario1Array);
		

		seminario1.print();				
		prof1.print();
		//local1.print();
		
		seminario2.print();				
		prof2.print();
		//local2.print();

	}

}
