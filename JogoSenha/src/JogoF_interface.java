//interface jogo nível fácil
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JogoF_interface extends JFrame{
	private JButton botaoVermelho, botaoAzul, botaoVerde, botaoRosa, botaoAmarelo, botaoLaranja, botaoTente, botaoLimpar;
	private JButton tentativas[][] = new JButton[8][4];		//MEU DEUS, QUANTO BOTAO
	private JButton acertos[][] = new JButton[8][4];
	private JButton botaoSenha[] = new JButton[4];
	private Color varCor[][] = new Color[8][4];
	private Color varCorAcertos[][] = new Color[8][4];
	private cores cmpCores[] = new cores[4];
	private int width = 40, height = 40;
	int i = 0,j = 0;
	JogoF JogoF;
	
	public JogoF_interface(){
		this.setTitle("Jogo Senha Nível Fácil");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		this.JogoF = new JogoF();
		JogoF_interfaceMain();
	}
	
	private void JogoF_interfaceMain(){
		//Botão Vermelho
		botaoVermelho = new JButton();
		botaoVermelho.setBounds(20, 540, width, height);
		botaoVermelho.setBackground(Color.RED);
		add(botaoVermelho);
		botaoRED botaoRED = new botaoRED();
		botaoVermelho.addActionListener(botaoRED);
		
		//Botão Azul
		botaoAzul = new JButton();
		botaoAzul.setBounds(70, 540, width, height);
		botaoAzul.setBackground(Color.BLUE);
		add(botaoAzul);
		botaoBLUE botaoBLUE = new botaoBLUE();
		botaoAzul.addActionListener(botaoBLUE);

		//Botão Verde
		botaoVerde = new JButton();
		botaoVerde.setBounds(120, 540, width, height);
		botaoVerde.setBackground(Color.GREEN);
		add(botaoVerde);
		botaoGREEN botaoGREEN = new botaoGREEN();
		botaoVerde.addActionListener(botaoGREEN);
		
		//Botão Rosa
		botaoRosa = new JButton();
		botaoRosa.setBounds(170, 540, width, height);
		botaoRosa.setBackground(Color.PINK);
		add(botaoRosa);
		botaoPINK botaoPINK = new botaoPINK();
		botaoRosa.addActionListener(botaoPINK);
		
		//Botão Amarelo
		botaoAmarelo = new JButton();
		botaoAmarelo.setBounds(220, 540, width, height);
		botaoAmarelo.setBackground(Color.YELLOW);
		add(botaoAmarelo);
		botaoYELLOW botaoYELLOW= new  botaoYELLOW();
		botaoAmarelo.addActionListener(botaoYELLOW);
		
		//Botão Laranja
		botaoLaranja = new JButton();
		botaoLaranja.setBounds(270, 540, width, height);
		botaoLaranja.setBackground(Color.ORANGE);
		add(botaoLaranja);
		botaoORANGE botaoORANGE = new botaoORANGE();
		botaoLaranja.addActionListener(botaoORANGE);
		
		//Botão Tentar
		botaoTente = new JButton();
		botaoTente.setBounds(70, 600, 90, 40);
		botaoTente.setText("Tentar");;
		add(botaoTente);
		botaoTRY botaoTRY = new botaoTRY();
		botaoTente.addActionListener(botaoTRY);
		
		//Botão Limpar
		botaoLimpar = new JButton();
		botaoLimpar.setBounds(200, 600, 90, 40);
		botaoLimpar.setText("Limpar");;
		add(botaoLimpar);
		botaoDEL botaoDEL = new botaoDEL();
		botaoLimpar.addActionListener(botaoDEL);
		
		espaçoTentativa();
		espaçoSenha();
	}
	
	private void espaçoSenha(){
		//senha escondida
		botaoSenha[0] = new JButton(new ImageIcon());
		botaoSenha[0].setBounds(65, 50, 50, 50);
		botaoSenha[0].setText("?");
		add(botaoSenha[0]);
		botaoSenha[1] = new JButton(new ImageIcon());
		botaoSenha[1].setBounds(115, 50, 50, 50);
		botaoSenha[1].setText("?");
		add(botaoSenha[1]);
		botaoSenha[2] = new JButton(new ImageIcon());
		botaoSenha[2].setBounds(165, 50, 50, 50);
		botaoSenha[2].setText("?");
		add(botaoSenha[2]);
		botaoSenha[3] = new JButton(new ImageIcon());
		botaoSenha[3].setBounds(215, 50, 50, 50);
		botaoSenha[3].setText("?");
		add(botaoSenha[3]);
	}
	
	private class botaoRED implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		//açoes
			if(i < 8 && j < 4){
				atualizaTentativas();
				varCor[i][j] = Color.RED;
				cmpCores[j] = cores.vermelho; 
				j++;
				JogoF_interfaceMain();
			}
		}	
	}
	
	private class botaoBLUE implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		//açoes
			if(i < 8 && j < 4){
				atualizaTentativas();
				varCor[i][j] = Color.BLUE;
				cmpCores[j] = cores.azul; 
				j++;
				JogoF_interfaceMain();

			}
		}
	}
	
	private class botaoGREEN implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		//açoes
			if(i < 8 && j < 4){
				atualizaTentativas();
				varCor[i][j] = Color.GREEN;
				cmpCores[j] = cores.verde; 
				j++;
				JogoF_interfaceMain();
			}
		}
	}
	
	private class botaoPINK implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		//açoes
			if(i < 8 && j < 4){
				atualizaTentativas();
				varCor[i][j] = Color.PINK;
				cmpCores[j] = cores.rosa; 
				j++;
				JogoF_interfaceMain();
			}
		}
	}
	
	private class botaoYELLOW implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		//açoes
			if(i < 8 && j < 4){
				atualizaTentativas();
				varCor[i][j] = Color.YELLOW;
				cmpCores[j] = cores.amarelo; 
				j++;
				JogoF_interfaceMain();
			}
		}
	}
	
	private class botaoORANGE implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		//açoes
			if(i < 8 && j < 4){
				atualizaTentativas();
				varCor[i][j] = Color.ORANGE;
				cmpCores[j] = cores.laranja; 
				j++;
				JogoF_interfaceMain();
			}
		}
	}
	
	private class botaoTRY implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		//açoes
			if(j == 4 && i < 8){
				int ganhou;
				ganhou = cmpSenha();
				if(ganhou == 1){ //se o jogador ganhou
					mostraSenha();
					UsuarioGanhou userGanhou = new UsuarioGanhou();
					userGanhou.setSize(300, 300);
					userGanhou.setVisible(true);
				}else{
					atualizaTentativas();
					j = 0;
					i++;
					JogoF_interfaceMain();
				}
			}
			if(i == 8){
				mostraSenha();	
				UsuarioPerdeu UsuarioPerdeu = new UsuarioPerdeu();
				UsuarioPerdeu.setSize(300, 300);
				UsuarioPerdeu.setVisible(true);

			}
		}
	}
	
	private class botaoDEL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		//açoes
			if(j != 0){
				j--;
				varCor[i][j] = null;
				atualizaTentativas();
				JogoF_interfaceMain();
			}
		}
	}
	
	private void atualizaTentativas(){
		for(int h = 0; h < 4; h++){
			for(int k = 0; k < 8; k++){
				remove(tentativas[k][h]);
				remove(acertos[k][h]);
			}
		}
		repaint();
	}
	
	private void espaçoTentativa(){ //botoes de tentativas lançadas
		//linhas = n tentativas     colunas = cores
		
		//linha0
		tentativas[0][0] = new JButton();
		tentativas[0][0].setBounds(70, 490, width, height);
		tentativas[0][0].setBackground(varCor[0][0]);
		add(tentativas[0][0]);
		tentativas[0][1] = new JButton();
		tentativas[0][1].setBounds(120, 490, width, height);
		tentativas[0][1].setBackground(varCor[0][1]);
		add(tentativas[0][1]);
		tentativas[0][2] = new JButton();
		tentativas[0][2].setBounds(170, 490, width, height);
		tentativas[0][2].setBackground(varCor[0][2]);
		add(tentativas[0][2]);
		tentativas[0][3] = new JButton();
		tentativas[0][3].setBounds(220, 490, width, height);
		tentativas[0][3].setBackground(varCor[0][3]);
		add(tentativas[0][3]);
		//linha 0 ajuda
		acertos[0][0] = new JButton();
		acertos[0][0].setBounds(290, 490, 16, 16);
		acertos[0][0].setBackground(varCorAcertos[0][0]);
		add(acertos[0][0]);
		acertos[0][1] = new JButton();
		acertos[0][1].setBounds(290, 510, 16, 16);
		acertos[0][1].setBackground(varCorAcertos[0][1]);
		add(acertos[0][1]);
		acertos[0][2] = new JButton();
		acertos[0][2].setBounds(310, 490, 16, 16);
		acertos[0][2].setBackground(varCorAcertos[0][2]);
		add(acertos[0][2]);
		acertos[0][3] = new JButton();
		acertos[0][3].setBounds(310, 510, 16, 16);
		acertos[0][3].setBackground(varCorAcertos[0][3]);
		add(acertos[0][3]);
		
		//linha1
		tentativas[1][0] = new JButton();
		tentativas[1][0].setBounds(70, 440, width, height);
		tentativas[1][0].setBackground(varCor[1][0]);
		add(tentativas[1][0]);
		tentativas[1][1] = new JButton();
		tentativas[1][1].setBounds(120, 440, width, height);
		tentativas[1][1].setBackground(varCor[1][1]);
		add(tentativas[1][1]);
		tentativas[1][2] = new JButton();
		tentativas[1][2].setBounds(170, 440, width, height);
		tentativas[1][2].setBackground(varCor[1][2]);
		add(tentativas[1][2]);
		tentativas[1][3] = new JButton();
		tentativas[1][3].setBounds(220, 440, width, height);
		tentativas[1][3].setBackground(varCor[1][3]);
		add(tentativas[1][3]);
		//linha 1 ajuda
		acertos[1][0] = new JButton();
		acertos[1][0].setBounds(290, 440, 16, 16);
		acertos[1][0].setBackground(varCorAcertos[1][0]);
		add(acertos[1][0]);
		acertos[1][1] = new JButton();
		acertos[1][1].setBounds(290, 460, 16, 16);
		acertos[1][1].setBackground(varCorAcertos[1][1]);
		add(acertos[1][1]);
		acertos[1][2] = new JButton();
		acertos[1][2].setBounds(310, 440, 16, 16);
		acertos[1][2].setBackground(varCorAcertos[1][2]);
		add(acertos[1][2]);
		acertos[1][3] = new JButton();
		acertos[1][3].setBounds(310, 460, 16, 16);
		acertos[1][3].setBackground(varCorAcertos[1][3]);
		add(acertos[1][3]);
		
		//linha2
		tentativas[2][0] = new JButton();
		tentativas[2][0].setBounds(70, 390, width, height);
		tentativas[2][0].setBackground(varCor[2][0]);
		add(tentativas[2][0]);
		tentativas[2][1] = new JButton();
		tentativas[2][1].setBounds(120, 390, width, height);
		tentativas[2][1].setBackground(varCor[2][1]);
		add(tentativas[2][1]);
		tentativas[2][2] = new JButton();
		tentativas[2][2].setBounds(170, 390, width, height);
		tentativas[2][2].setBackground(varCor[2][2]);
		add(tentativas[2][2]);
		tentativas[2][3] = new JButton();
		tentativas[2][3].setBounds(220, 390, width, height);
		tentativas[2][3].setBackground(varCor[2][3]);
		add(tentativas[2][3]);
		//linha 2 ajuda
		acertos[2][0] = new JButton();
		acertos[2][0].setBounds(290, 390, 16, 16);
		acertos[2][0].setBackground(varCorAcertos[2][0]);
		add(acertos[2][0]);
		acertos[2][1] = new JButton();
		acertos[2][1].setBounds(290, 410, 16, 16);
		acertos[2][1].setBackground(varCorAcertos[2][1]);
		add(acertos[2][1]);
		acertos[2][2] = new JButton();
		acertos[2][2].setBounds(310, 390, 16, 16);
		acertos[2][2].setBackground(varCorAcertos[2][2]);
		add(acertos[2][2]);
		acertos[2][3] = new JButton();
		acertos[2][3].setBounds(310, 410, 16, 16);
		acertos[2][3].setBackground(varCorAcertos[2][3]);
		add(acertos[2][3]);
		
		//linha3
		tentativas[3][0] = new JButton();
		tentativas[3][0].setBounds(70, 340, width, height);
		tentativas[3][0].setBackground(varCor[3][0]);
		add(tentativas[3][0]);
		tentativas[3][1] = new JButton();
		tentativas[3][1].setBounds(120, 340, width, height);
		tentativas[3][1].setBackground(varCor[3][1]);
		add(tentativas[3][1]);
		tentativas[3][2] = new JButton();
		tentativas[3][2].setBounds(170, 340, width, height);
		tentativas[3][2].setBackground(varCor[3][2]);
		add(tentativas[3][2]);
		tentativas[3][3] = new JButton();
		tentativas[3][3].setBounds(220, 340, width, height);
		tentativas[3][3].setBackground(varCor[3][3]);
		add(tentativas[3][3]);
		//linha 3 ajuda
		acertos[3][0] = new JButton();
		acertos[3][0].setBounds(290, 340, 16, 16);
		acertos[3][0].setBackground(varCorAcertos[3][0]);
		add(acertos[3][0]);
		acertos[3][1] = new JButton();
		acertos[3][1].setBounds(290, 360, 16, 16);
		acertos[3][1].setBackground(varCorAcertos[3][1]);
		add(acertos[3][1]);
		acertos[3][2] = new JButton();
		acertos[3][2].setBounds(310, 340, 16, 16);
		acertos[3][2].setBackground(varCorAcertos[3][2]);
		add(acertos[3][2]);
		acertos[3][3] = new JButton();
		acertos[3][3].setBounds(310, 360, 16, 16);
		acertos[3][3].setBackground(varCorAcertos[3][3]);
		add(acertos[3][3]);
		
		//linha4
		tentativas[4][0] = new JButton();
		tentativas[4][0].setBounds(70, 290, width, height);
		tentativas[4][0].setBackground(varCor[4][0]);
		add(tentativas[4][0]);
		tentativas[4][1] = new JButton();
		tentativas[4][1].setBounds(120, 290, width, height);
		tentativas[4][1].setBackground(varCor[4][1]);
		add(tentativas[4][1]);
		tentativas[4][2] = new JButton();
		tentativas[4][2].setBounds(170, 290, width, height);
		tentativas[4][2].setBackground(varCor[4][2]);
		add(tentativas[4][2]);
		tentativas[4][3] = new JButton();
		tentativas[4][3].setBounds(220, 290, width, height);
		tentativas[4][3].setBackground(varCor[4][3]);
		add(tentativas[4][3]);
		//linha 4 ajuda
		acertos[4][0] = new JButton();
		acertos[4][0].setBounds(290, 290, 16, 16);
		acertos[4][0].setBackground(varCorAcertos[4][0]);
		add(acertos[4][0]);
		acertos[4][1] = new JButton();
		acertos[4][1].setBounds(290, 310, 16, 16);
		acertos[4][1].setBackground(varCorAcertos[4][1]);
		add(acertos[4][1]);
		acertos[4][2] = new JButton();
		acertos[4][2].setBounds(310, 290, 16, 16);
		acertos[4][2].setBackground(varCorAcertos[4][2]);
		add(acertos[4][2]);
		acertos[4][3] = new JButton();
		acertos[4][3].setBounds(310, 310, 16, 16);
		acertos[4][3].setBackground(varCorAcertos[4][3]);
		add(acertos[4][3]);
		
		//linha5
		tentativas[5][0] = new JButton();
		tentativas[5][0].setBounds(70, 240, width, height);
		tentativas[5][0].setBackground(varCor[5][0]);
		add(tentativas[5][0]);
		tentativas[5][1] = new JButton();
		tentativas[5][1].setBounds(120, 240, width, height);
		tentativas[5][1].setBackground(varCor[5][1]);
		add(tentativas[5][1]);
		tentativas[5][2] = new JButton();
		tentativas[5][2].setBounds(170, 240, width, height);
		tentativas[5][2].setBackground(varCor[5][2]);
		add(tentativas[5][2]);
		tentativas[5][3] = new JButton();
		tentativas[5][3].setBounds(220, 240, width, height);
		tentativas[5][3].setBackground(varCor[5][3]);
		add(tentativas[5][3]);
		//linha 5 ajuda
		acertos[5][0] = new JButton();
		acertos[5][0].setBounds(290, 240, 16, 16);
		acertos[5][0].setBackground(varCorAcertos[5][0]);
		add(acertos[5][0]);
		acertos[5][1] = new JButton();
		acertos[5][1].setBounds(290, 260, 16, 16);
		acertos[5][1].setBackground(varCorAcertos[5][1]);
		add(acertos[5][1]);
		acertos[5][2] = new JButton();
		acertos[5][2].setBounds(310, 240, 16, 16);
		acertos[5][2].setBackground(varCorAcertos[5][2]);
		add(acertos[5][2]);
		acertos[5][3] = new JButton();
		acertos[5][3].setBounds(310, 260, 16, 16);
		acertos[5][3].setBackground(varCorAcertos[5][3]);
		add(acertos[5][3]);
		
		//linha6
		tentativas[6][0] = new JButton();
		tentativas[6][0].setBounds(70, 190, width, height);
		tentativas[6][0].setBackground(varCor[6][0]);
		add(tentativas[6][0]);
		tentativas[6][1] = new JButton();
		tentativas[6][1].setBounds(120, 190, width, height);
		tentativas[6][1].setBackground(varCor[6][1]);
		add(tentativas[6][1]);
		tentativas[6][2] = new JButton();
		tentativas[6][2].setBounds(170, 190, width, height);
		tentativas[6][2].setBackground(varCor[6][2]);
		add(tentativas[6][2]);
		tentativas[6][3] = new JButton();
		tentativas[6][3].setBounds(220, 190, width, height);
		tentativas[6][3].setBackground(varCor[6][3]);
		add(tentativas[6][3]);
		//linha 6 ajuda
		acertos[6][0] = new JButton();
		acertos[6][0].setBounds(290, 190, 16, 16);
		acertos[6][0].setBackground(varCorAcertos[6][0]);
		add(acertos[6][0]);
		acertos[6][1] = new JButton();
		acertos[6][1].setBounds(290, 210, 16, 16);
		acertos[6][1].setBackground(varCorAcertos[6][1]);
		add(acertos[6][1]);
		acertos[6][2] = new JButton();
		acertos[6][2].setBounds(310, 190, 16, 16);
		acertos[6][2].setBackground(varCorAcertos[6][2]);
		add(acertos[6][2]);
		acertos[6][3] = new JButton();
		acertos[6][3].setBounds(310, 210, 16, 16);
		acertos[6][3].setBackground(varCorAcertos[6][3]);
		add(acertos[6][3]);
		
		//linha7
		tentativas[7][0] = new JButton();
		tentativas[7][0].setBounds(70, 140, width, height);
		tentativas[7][0].setBackground(varCor[7][0]);
		add(tentativas[7][0]);
		tentativas[7][1] = new JButton();
		tentativas[7][1].setBounds(120, 140, width, height);
		tentativas[7][1].setBackground(varCor[7][1]);
		add(tentativas[7][1]);
		tentativas[7][2] = new JButton();
		tentativas[7][2].setBounds(170, 140, width, height);
		tentativas[7][2].setBackground(varCor[7][2]);
		add(tentativas[7][2]);
		tentativas[7][3] = new JButton();
		tentativas[7][3].setBounds(220, 140, width, height);
		tentativas[7][3].setBackground(varCor[7][3]);
		add(tentativas[7][3]);
		//linha 7 ajuda
		acertos[7][0] = new JButton();
		acertos[7][0].setBounds(290, 140, 16, 16);
		acertos[7][0].setBackground(varCorAcertos[7][0]);
		add(acertos[7][0]);
		acertos[7][1] = new JButton();
		acertos[7][1].setBounds(290, 160, 16, 16);
		acertos[7][1].setBackground(varCorAcertos[7][1]);
		add(acertos[7][1]);
		acertos[7][2] = new JButton();
		acertos[7][2].setBounds(310, 140, 16, 16);
		acertos[7][2].setBackground(varCorAcertos[7][2]);
		add(acertos[7][2]);
		acertos[7][3] = new JButton();
		acertos[7][3].setBounds(310, 160, 16, 16);
		acertos[7][3].setBackground(varCorAcertos[7][3]);
		add(acertos[7][3]);
	}
	
	/*Se o jogador acertar uma cor que está escondida, mas em posição incorreta, ganha um ponto cinza. 2
	- Se o jogador acertar cor e posição correta, ganha um ponto preto.  1
	- Se o jogador não acerta cor não ganha nenhum ponto (branco).  0*/  
	private int cmpSenha(){
		int flagCoresIguais[] = new int[4], flagCoresIguaisAux = 0;
		flagCoresIguais = JogoF.cmpSenha(cmpCores);
		
		for(int h = 0; h < 4; h++){
			if(flagCoresIguais[h] == 1){
				varCorAcertos[i][h] = Color.BLACK;
				flagCoresIguaisAux++;
			}
			if(flagCoresIguais[h] == 2){
				varCorAcertos[i][h] = Color.GRAY;
			}
			if(flagCoresIguais[h] == 0){
				varCorAcertos[i][h] = Color.WHITE;
			}
		}

		if(flagCoresIguaisAux == 4) return 1; //se todas as cores estiverem na posição certa;
		return 0;
	}

	private void mostraSenha(){
		atualizaSenha();
		
		botaoSenha[0] = new JButton();
		botaoSenha[0].setBounds(65, 50, 50, 50);
		if(i == 8) botaoSenha[0].setBackground(varCor[i-1][0]);
		else botaoSenha[0].setBackground(varCor[i][0]);
		add(botaoSenha[0]);
		botaoSenha[1] = new JButton();
		botaoSenha[1].setBounds(115, 50, 50, 50);
		if(i == 8) botaoSenha[1].setBackground(varCor[i-1][1]);
		else botaoSenha[1].setBackground(varCor[i][1]);
		add(botaoSenha[1]);
		botaoSenha[2] = new JButton();
		botaoSenha[2].setBounds(165, 50, 50, 50);
		if(i == 8) botaoSenha[2].setBackground(varCor[i-1][2]);
		else botaoSenha[2].setBackground(varCor[i][2]);
		add(botaoSenha[2]);
		botaoSenha[3] = new JButton();
		botaoSenha[3].setBounds(215, 50, 50, 50);
		if(i == 8) botaoSenha[3].setBackground(varCor[i-1][3]);
		else botaoSenha[3].setBackground(varCor[i][3]);
		add(botaoSenha[3]);
	}
	
	private void atualizaSenha(){
		for(int k = 0; k < 4; k++){
			remove(botaoSenha[k]);
		}
		repaint();
	}
}
