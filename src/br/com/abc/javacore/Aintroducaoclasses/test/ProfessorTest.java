package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
	public static void main(String[] args) {
		
		Professor professor = new Professor();
		
		professor.nome = "Anderson Alves";
		professor.matricula = "08101989";
		professor.rg = "30.174.762-0";
		professor.cpf = "123.456.789-10";
		
		System.out.println("=== DADOS PROFESSOR ===");
		System.out.println("Nome: "+professor.nome);
		System.out.println("Matrícula: "+professor.matricula);
		System.out.println("RG: "+professor.rg);
		System.out.println("CPF: "+professor.cpf+"\n");
		//System.out.println("\n");
		
		Professor professor2 = new Professor();
		
		professor2.nome = "Mariana";
		professor2.matricula = "24041990";
		professor2.rg = "90.174.462-0";
		professor2.cpf = "111.222.333-44";
		
		System.out.println("Nome: "+professor2.nome);
		System.out.println("Matrícula: "+professor2.matricula);
		System.out.println("RG: "+professor2.rg);
		System.out.println("CPF: "+professor2.cpf);
		
	}	

}
