package cursojava.executavel;

public class OperacoeslogicasAninhadas {
	public static void main(String[] args) {
		int nota1 = 50;
		int nota2 = 50;
		int nota3 = 50;
		int nota4 = 50;
		float media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Operações lógicas aninhadas: São operações dentro de operações */

		if (media >= 50) {
			if (media >= 70) {
				System.out.println("Aluno aprovado");
			} else {
				System.out.println("Aluno de recuperação");
			}
		} else {
			System.out.println("Aluno reprovado direto");
		}
	}

}
