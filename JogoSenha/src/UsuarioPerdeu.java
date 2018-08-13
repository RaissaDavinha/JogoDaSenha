import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UsuarioPerdeu extends JFrame{
private JButton reiniciar;
	
	public UsuarioPerdeu(){
		this.setTitle("Você ganhou!!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Perdeu");
		label.setText("Você perdeu! Deseja jogar novamente?");
		add(label);
		
		reiniciar =  new JButton();
		reiniciar.setText("REINICIAR");
		reiniciar.setSize(50, 100);
		add(reiniciar);
		
		iniciaJogoF jogoF = new iniciaJogoF();
		reiniciar.addActionListener(jogoF);
	}
	
	private class iniciaJogoF implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JogoF_interface interfaceF = new JogoF_interface();
			interfaceF.setSize(400, 700);
			interfaceF.setVisible(true);
		}	
	}
}
