package cursojava.executavel;

public class EstruturaFor {
	public static void main(String[] args) {
		
		/*Estrutura de repetição For com Break(PARADA)*/
		
		for (int numero = 10; numero!=0; numero--) {
			System.out.println("Numero atual: "+numero);
			if(numero==7) {
				System.out.println("Achamos o seu numero 7");
				System.out.println("Estou parando de executar");
				break;
			}

		}
	}
}
