package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {

	/**
	 * @author ander
	 * 
	 *         Para Criar um m�todo, sempre vai ter: ++ Modificador de Acesso:
	 *         public, private ou protected ++ TIpo de Retorno ou nenhum tipo ++
	 *         Nome do m�todo
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
	 * c�digo e menor a possibilidade de acontecer bugs
	 *
	 * Agora iremos criar um m�todo, passando os atributos por par�metro no
	 * m�todo, para receber os par�metros do usu�rio
	 */

	public static void multiplicaDoisNumeros(int num1, int num2) {// Vari�veis criadas
															// localmente

		System.out.println(num1 * num2);
	}

	/**
	 * Cria��o de m�todo com retorno sem syso.
	 */
	public static void divideDoisNumeros(double num1, double num2) {
		if (num2 != 0) {
			System.out.println(num1 / num2);
			return;// S� pode ser utilizado dessa forma em m�todos void, pois �
					// utilizado como break.
		}
		System.out.println("O n�mero n�o pode ser div�sivel por 0.");
	}

	public static void alteraDoisNumeros(int num1, int num2) {
		num1 = 30;
		num2 = 40;
		System.out.println("Dentro do Altera Dois Numeros");
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);

	}

	// Aqui a passagem de par�metros s� pode ser passada por arrays
	public static void somaArray(int[] numeros) {
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		System.out.println(soma + "\n");
	}
	/*
	 * A partir do JAVA 5 foi criado um tipo novo de par�metros: O var arqs[]
	 * 
	 * Com o Var Args voc� pode passar os par�metros por objetos arrays ou
	 * simplismente separado por v�rgula
	 * 
	 * S� pode ter um var args por assinatura de m�todos
	 * 
	 * Se for passar mais de um par�metro, o var args precisa ser o �ltimo
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
