package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {

	/**
	 * @author ander
	 * 
	 *         Para Criar um método, sempre vai ter: ++ Modificador de Acesso:
	 *         public, private ou protected ++ TIpo de Retorno ou nenhum tipo ++
	 *         Nome do método
	 *
	 */

	public static void somaDoisNumeros() {
		System.out.println(5 + 5);
	}

	public static void subtraiDoisNumeros() {
		System.out.println(5 - 5);
	}

	/**
	 * Quando menos responsabilidade uma classe tiver, melhor para manter o
	 * código e menor a possibilidade de acontecer bugs
	 *
	 * Agora iremos criar um método, passando os atributos por parâmetro no
	 * método, para receber os parâmetros do usuário
	 */

	public static void multiplicaDoisNumeros(int num1, int num2) {// Variáveis criadas
															// localmente

		System.out.println(num1 * num2);
	}

	/**
	 * Criação de método com retorno sem syso.
	 */
	public static void divideDoisNumeros(double num1, double num2) {
		if (num2 != 0) {
			System.out.println(num1 / num2);
			return;// Só pode ser utilizado dessa forma em métodos void, pois é
					// utilizado como break.
		}
		System.out.println("O número não pode ser divísivel por 0.");
	}

	public static void alteraDoisNumeros(int num1, int num2) {
		num1 = 30;
		num2 = 40;
		System.out.println("Dentro do Altera Dois Numeros");
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);

	}

	// Aqui a passagem de parâmetros só pode ser passada por arrays
	public static void somaArray(int[] numeros) {
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		System.out.println(soma + "\n");
	}
	/*
	 * A partir do JAVA 5 foi criado um tipo novo de parâmetros: O var arqs[]
	 * 
	 * Com o Var Args você pode passar os parâmetros por objetos arrays ou
	 * simplismente separado por vírgula
	 * 
	 * Só pode ter um var args por assinatura de métodos
	 * 
	 * Se for passar mais de um parâmetro, o var args precisa ser o último
	 * 
	 */

	public static void somaVarArgs(int... numeros) {
		int soma = 0;
		for (int aux : numeros) {
			soma += aux;
		}
		System.out.println(soma);
	}

}
