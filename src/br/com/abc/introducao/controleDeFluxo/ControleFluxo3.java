package br.com.abc.introducao.controleDeFluxo;

public class ControleFluxo3 {
	public static void main(String[] args) {
		byte dia = 6;
		switch (dia) {
		// Tipos de dados que podem ser passados no switch:
		// char, int, byte, short, enum e String(Apartir do Java7)

		case 1:
			System.out.println("Domingo");
			break;// Sempre lembrar de colocar o break dentro de cada Case.
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		}
		char sexo = 'F';// char aceita valores numericos de até 2 byts.
		// No char usa '' e na String usa "".
		switch (sexo) {
		case 'M':
			System.out.println("Sexo Masculino");
			break;
		case 'F':
			System.out.println("Sexo Feminino");
			break;
		default:
			System.out.println("Opção Inválida.");
		}
	}

}
