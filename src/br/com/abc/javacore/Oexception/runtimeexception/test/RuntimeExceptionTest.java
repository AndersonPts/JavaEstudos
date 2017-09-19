package br.com.abc.javacore.Oexception.runtimeexception.test;

public class RuntimeExceptionTest {
	
	/*NullPointer...=> Erro de execu��o. Acontece quando tenta acessar um metodo atraves de uma
	 * vari�vel de refer�ncia e ela n�o tem nenhum objeto em mem�ria sendo referenciada.
	 * */

	public static void main(String[] args) {
		/*Object o = null;
		int a = 10;
		int b = 0;
			if(b!=0){
			int c = a/b;
			System.out.println(c);
		}
		
		// No try-cat a jvm continua executando comandos depois desse bloco, ap�s alguma exce��o
		try {
			int[] a = new int[2];
			System.out.println(a[2]);
			System.out.println("Imprimindo depois da poss�vel exce��o...");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Fora do bloco de Try Catch");*/
		divisao(10, 0);
	}
	
	private static void divisao(double num1, double num2){
		if(num2 == 0){
			throw new IllegalArgumentException("Passe um valor diferente de zero no num2.");
		}
		double result = num1/num2;
		System.out.println(result);
	}
}
