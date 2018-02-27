package br.com.abc.introducao.controleDeFluxo;
//Tipo primitivo:
// Vari�vel que voc� s� pode por um �nico valor do mesmo tipo.

public class ControleFluxo6 {
	public static void main(String[] args) {
		//Dado um valor de um carro, descubra em quantas parcelas ele pode ser parcelado.
		// As parcelas n�o podem ser menores do que 1000
				
		double valorTotal = 38370;
		for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
			double valorParcela = valorTotal / parcela;
			if(valorParcela <= 5000){
			continue;//Ignora c�digos abaixo dentro da chave	
			}
			System.out.println("Parcela "+ parcela + " R$" + valorParcela);
			System.out.println("C�digo Consumindo mem�ria");
			
		}
	}

}
