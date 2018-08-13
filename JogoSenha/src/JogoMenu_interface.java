//Interface menu principal
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JogoMenu_interface extends JFrame{
	private JButton inicioFacil;
	private JButton regras;
	
	public JogoMenu_interface(){
		this.setTitle("Jogo Senha");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		inicioFacil =  new JButton();
		inicioFacil.setText("Nível Fácil");
		inicioFacil.setSize(50, 100);
		add(inicioFacil);
		
		regras =  new JButton();
		regras.setText("Regras do Jogo");
		regras.setSize(50, 100);
		add(regras);
		
		iniciaJogoF jogoF = new iniciaJogoF();
		inicioFacil.addActionListener(jogoF);
		
		iniciaRegras iniciaRegras = new iniciaRegras();
		regras.addActionListener(iniciaRegras);
	}

	private class iniciaJogoF implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JogoF_interface interfaceF = new JogoF_interface();
			interfaceF.setSize(400, 700);
			interfaceF.setVisible(true);
		}	
	}
	
	private class iniciaRegras implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Regras Regras = new Regras();
			Regras.setSize(800, 300);
			Regras.setVisible(true);
		}	
	}
}
