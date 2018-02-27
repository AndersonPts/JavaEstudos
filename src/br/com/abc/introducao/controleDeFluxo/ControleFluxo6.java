package br.com.abc.introducao.controleDeFluxo;
//Tipo primitivo:
// Variável que você só pode por um único valor do mesmo tipo.

public class ControleFluxo6 {
	public static void main(String[] args) {
		//Dado um valor de um carro, descubra em quantas parcelas ele pode ser parcelado.
		// As parcelas não podem ser menores do que 1000
				
		double valorTotal = 38370;
		for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
			double valorParcela = valorTotal / parcela;
			if(valorParcela <= 5000){
			continue;//Ignora códigos abaixo dentro da chave	
			}
			System.out.println("Parcela "+ parcela + " R$" + valorParcela);
			System.out.println("Código Consumindo memória");
			
		}
	}

}
