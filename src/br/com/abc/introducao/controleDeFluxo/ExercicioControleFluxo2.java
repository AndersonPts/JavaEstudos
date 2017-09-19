package br.com.abc.introducao.controleDeFluxo;

public class ExercicioControleFluxo2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte dia = 3;		
		
		switch (dia){
		case 1:
			System.out.println("Hoje é Domingo.");
			break;
		case 2:
			System.out.println("Hoje é Segunda.");
			break;
		case 3:
			System.out.println("Hoje é Terça.");
			break;
		case 4:
			System.out.println("Hoje é Quarta.");
			break;
		case 5:
			System.out.println("Hoje é Quinta.");
			break;
		case 6:
			System.out.println("Hoje é Sexta.");
			break;
		case 7:
			System.out.println("Hoje é Sábado.");
			break;
		default:
			System.out.println("Opção Inválida!");
		}
		
		if(dia == 1 || dia == 7){
			System.out.println("Final de Semana.");
		}else if(dia == 2 || dia==3 || dia==4 || dia==5 || dia==6){
			System.out.println("Dia Útil.");
		}else{
			System.out.println("Por favor selecione um dia válido...");
		}
	}

}
