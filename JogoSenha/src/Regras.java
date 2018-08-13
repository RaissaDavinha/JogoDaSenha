import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Regras extends JFrame{

	public Regras(){
		this.setTitle("REGRAS");
		setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("Perdeu");
		label1.setText("O objetivo do jogo é descobrir uma senha de cores escolhida pelo computador. Clique nas cores para selecioná-las.\n ");
		add(label1);
		
		JLabel label2 = new JLabel("Perdeu");
		label2.setText("Quando preencher as quatro lacunas, clique em tentar!");
		add(label2);
		
		JLabel label6 = new JLabel("Perdeu");
		label6.setText("O jogador recebe uma resposta, indicando seus acertos, de acordo com as seguintes regras:");
		add(label6);
		
		JLabel label3 = new JLabel("Perdeu");
		label3.setText("- Se o jogador acertar uma cor que está escondida, mas em posição incorreta, ganha um ponto cinza.\n");
		add(label3);
		
		JLabel label4 = new JLabel("Perdeu");
		label4.setText("- Se o jogador acertar cor e posição correta, ganha um ponto preto.\n");
		add(label4);
		
		JLabel label5 = new JLabel("Perdeu");
		label5.setText("- Se o jogador não acerta cor não ganha nenhum ponto (branco).");
		add(label5);
	}
}
