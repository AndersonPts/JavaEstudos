package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.Funcionario;
import br.com.abc.javacore.Npolimorfismo.classes.Gerente;
import br.com.abc.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
	public static void main(String[] args) {
		Gerente g = new Gerente("Anderson Alves", 3.500, 2000);
		Vendedor v = new Vendedor("Yuri", 2000, 20000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
		/*relatorio.relatorioPgtoGerente(g);
		relatorio.relatorioPgtoVendedor(v);*/
		
		relatorio.pagamentoGenerico(g);
		relatorio.pagamentoGenerico(v);
				
		/* SEMPRE É O OBJETO Q É EXCUTADO
		Aqui é criado UMA REFERÊNCIA DE FUNCIONARIO PARA GERENTE
		Funcionario f = g; ==> CAST Q PODE SER FEITO POR CLASSES DE MESMA HIERARQUIA
		System.out.println("######################");
		System.out.println(f.getSalario());
		*/
	}

}
