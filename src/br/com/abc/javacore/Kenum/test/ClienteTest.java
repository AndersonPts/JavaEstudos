package br.com.abc.javacore.Kenum.test;

import br.com.abc.javacore.Kenum.classes.Cliente;
import br.com.abc.javacore.Kenum.classes.TipoCliente;

public class ClienteTest {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Ana", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
		System.out.println(cliente);
		
		Cliente c2 = new Cliente("PSA Cons", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.AVISTA);
		System.out.println(c2);
		
		Cliente c3 = new Cliente("PTI", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.APRAZO );
		System.out.println(c3);
	}

}
