package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Professor prof = new Professor();		
		prof.nome = "Marcelo";
		prof.matricula = "11122";
		prof.rg = "122211-5";
		prof.cpf = "122.222.232-20";
		
		Professor prof2 = new Professor();		
		prof2.nome = "Anderson ALves";
		prof2.matricula = "432876";
		prof2.rg = "1867411-0";
		prof2.cpf = "525.826.290-10";		
			
		prof.imprime();
		prof2.imprime();
	
		}
	}
