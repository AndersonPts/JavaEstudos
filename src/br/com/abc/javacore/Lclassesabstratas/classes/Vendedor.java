package br.com.abc.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario {
	private double totalVendas;		
	
	public Vendedor(String nome, String clt, double salario, double totalVendas) {
		super(nome, clt, salario);
		this.totalVendas = totalVendas;
		// TODO Auto-generated constructor stub
	}		
	
	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	@Override
	public void calculaSalario(){
		this.salario = salario + (totalVendas * 0.05);
	}

}
