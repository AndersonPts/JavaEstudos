package br.com.abc.introducao.controleDeFluxo;

public class ExercicioControleFluxo2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte dia = 3;		
		
		switch (dia){
		case 1:
			System.out.println("Hoje � Domingo.");
			break;
		case 2:
			System.out.println("Hoje � Segunda.");
			break;
		case 3:
			System.out.println("Hoje � Ter�a.");
			break;
		case 4:
			System.out.println("Hoje � Quarta.");
			break;
		case 5:
			System.out.println("Hoje � Quinta.");
			break;
		case 6:
			System.out.println("Hoje � Sexta.");
			break;
		case 7:
			System.out.println("Hoje � S�bado.");
			break;
		default:
			System.out.println("Op��o Inv�lida!");
		}
		
		if(dia == 1 || dia == 7){
			System.out.println("Final de Semana.");
		}else if(dia == 2 || dia==3 || dia==4 || dia==5 || dia==6){
			System.out.println("Dia �til.");
		}else{
			System.out.println("Por favor selecione um dia v�lido...");
		}
	}

}
