package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {
	
	/*public void relatorioPgtoGerente(Gerente gerente){
		
		System.out.println("Gerando relat�rio de pagamento para a ger�ncia.");
		gerente.calcularPagamento();
		System.out.println("Nome: "+gerente.getNome());
		System.out.println("Sal�rio do m�s: "+gerente.getSalario());
		
	}
	
	public void relatorioPgtoVendedor(Vendedor vendedor){
		System.out.println("===========================================");
		System.out.println("Gerando relat�rio de pagamento para a ger�ncia.");
		vendedor.calcularPagamento();
		System.out.println("Nome: "+vendedor.getNome());
		System.out.println("Sal�rio do m�s: "+vendedor.getSalario());		
	}*/
	
	/* ABAIXO UTILIZAMOS O POLIMORFISMO, QUE PODE TANTO SER USADO PELA CLASSE VENDEDOR QUANTO A CLASSE
		GERENTE E ECONOMIZAMOS O BLOCO DE LINHAS ACIMA.
		
		PAR�METROS POLIFORMICOS
	*/
	public void pagamentoGenerico(Funcionario funcionario){
		System.out.println("===========================================");
		System.out.println("Gerando relat�rio de pagamento para a ger�ncia.");
		funcionario.calcularPagamento();
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Sal�rio do m�s: "+funcionario.getSalario());
		// PARA PODER PASSA O pnl do gerente, necessita=se realizar um cast:
		if(funcionario instanceof Gerente){ //instanceof-> retona um booleano caso a variavel de referencia seja a q vc deseja (true->executa)
		Gerente g = (Gerente) funcionario;
		System.out.println("Participa��o nos lucros: "+ g.getPnl());
		
		}
		
		if(funcionario instanceof Vendedor){ //instanceof-> retona um booleano caso a variavel de referencia seja a q vc deseja (true->executa)
			Vendedor v = (Vendedor) funcionario;
			System.out.println("Total vendas: "+ v.getTotalVendas());
			
			}
	}
	

}
