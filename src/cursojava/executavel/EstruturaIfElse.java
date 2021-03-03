package cursojava.executavel;

public class EstruturaIfElse {
	public static void main(String[] args) {
		int nota1 = 40;
		int nota2 = 40;
		int nota3 = 40;
		int nota4 = 40;
		float media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/* Condições lógicas com If e Else*//*
		if (media > 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}
		*/
		
		/*Operadores ternários são para micro validações */
		
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno aprovado" : media >= 40 && media <= 69 ? 
				"Aluno de recuperação" : "Aluno reprovado";
		
		System.out.println(saidaResultado);
		
	}
}
