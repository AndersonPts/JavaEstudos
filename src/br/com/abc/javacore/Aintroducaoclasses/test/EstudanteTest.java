package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante joao = new Estudante(); // jo�o -> Vari�vel de refer�ncia ------ Objeto -> Estudante
										// New cria um objeto
		
		joao.nome = "Jo�o";
		joao.matricula = "1212";
		joao.idade = 15;
		
		System.out.println("O aluno "+joao.nome+" tem "+joao.idade+" anos e pertence � matr�cula "+joao.matricula+".");
	}
// Conceito de coes�o -> Uma classe fazer determinado c�digo que ela foi criada para fazer.
//Baixa coes�o -> Coisa ruim   -----  Alta Coes�o -> Coisa Boa
}
