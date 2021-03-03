package cursojava.executavel;

import javax.swing.JOptionPane;

public class EntradaeSaidaDados {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		
		int divisao = (int) (carroNumero / pessoasNumero);
		
		int resto = (int) (carroNumero % pessoasNumero);
		
		JOptionPane.showMessageDialog(null, "Foram divididos " +carros +" carros para "+pessoas +" pessoas e deu "+ divisao + 
				" carros para cada , sobraram "+ resto + " carros");
	}
}

