package Application;
/**
 * Os exemplos aqui est�o como nas aulas do curso jdev treinamentos.
 */


import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
		
//		Entrada de dados com JOptionPane
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");

//		Agora precisamos converter em n�meros esses dados para processa-los
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu " + divisao + " carros" + " e sobraram " + resto + " carros");
		
	}

}
