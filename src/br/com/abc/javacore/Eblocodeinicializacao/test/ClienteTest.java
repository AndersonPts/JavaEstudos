package br.com.abc.javacore.Eblocodeinicializacao.test;

import br.com.abc.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		
		System.out.println("Exibindo a quantidade de parcelas poss�veis");
		for(int parcela : c.getParcelas()){
			System.out.println("Parcela "+parcela);
		}
	}

}
