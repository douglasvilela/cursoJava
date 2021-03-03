package cursojava.executavel;

public class SwitchCase {
	public static void main(String[] args) {
		
		/* SWITCH CASE: OPERAÇÕES EXATAS */
		
		int dia = 3;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;

		default: System.out.println("Outro dia qualquer");
			break;
		}
	}
}
