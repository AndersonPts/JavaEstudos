package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante joao = new Estudante(); // joão -> Variável de referência ------ Objeto -> Estudante
										// New cria um objeto
		
		joao.nome = "João";
		joao.matricula = "1212";
		joao.idade = 15;
		
		System.out.println("O aluno "+joao.nome+" tem "+joao.idade+" anos e pertence à matrícula "+joao.matricula+".");
	}
// Conceito de coesão -> Uma classe fazer determinado código que ela foi criada para fazer.
//Baixa coesão -> Coisa ruim   -----  Alta Coesão -> Coisa Boa
}
