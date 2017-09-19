package br.com.abc.introducao.controleDeFluxo;

public class ControleDeFluxo5 {
	public static void main(String[] args) {
		//Dado um valor de um carro, descubra em quantas parcelas ele pode ser parcelado.
		// As parcelas não podem ser menores do que 1000
		
		double valorTotal = 30000;
		double valParcela = 5000;
		double parcela;
		
		if(valParcela >= 1000){
			parcela = valorTotal/valParcela;
			System.out.println("Valor do Carro: "+valorTotal);
			System.out.println("Valor por parcela: "+valParcela);
			System.out.println("quantidade de parcelas: "+ (int)parcela);
			
		}
		
	}

}
