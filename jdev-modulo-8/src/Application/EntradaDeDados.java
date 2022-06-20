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
		
//		Criando a op�ao de confirmacao caso a deseje ver o resultado da divisao
		int respostaVerDivisao = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		if(respostaVerDivisao == 0) {
			
			JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu " + divisao + " carros");
		}
		
//		Criando segunda caixa de confirmacao caso queira ver o RESTO da divis�o
		respostaVerDivisao = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divis�o?");
		
		if(respostaVerDivisao == 0) {
			JOptionPane.showMessageDialog(null, "O RESTO da divis�o � " + resto);
		}else {
			JOptionPane.showMessageDialog(null, "Voc� n�o quis ver o RESTO da divis�o.");
		}
		
		
	}

}
