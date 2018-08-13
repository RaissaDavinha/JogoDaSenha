import java.util.Random;

//codigo do jogo
enum cores {vermelho, azul, verde, rosa, amarelo, laranja}; // para fazer aleatorio do jogo

public class JogoF {
	cores resultSenha[] = new cores[4];
	Random gerador = new Random();
	int i = 0, j = 0;

	public JogoF() {
		geraSenha();
	}
	
	/*Se o jogador acertar uma cor que está escondida, mas em posição incorreta, ganha um ponto cinza. 2
	- Se o jogador acertar cor e posição correta, ganha um ponto preto.  1
	- Se o jogador não acerta cor não ganha nenhum ponto (branco).  0*/  
	public int[] cmpSenha(cores cor[]){ //cor certa = 2,  posiçao certa = 1, tudo errado = 0
		cores auxSenha[] = new cores[4];
		int decod[] = new int[4];
		int aux = 0;
		
		for(int h = 0; h < 4; h++){
			auxSenha[h] = resultSenha[h];
		}
		
		for(int h = 0; h < 4; h++){
			if(cor[h] == auxSenha[h] && aux < 4 && auxSenha != null){
				auxSenha[h] = null;
				decod[aux] = 1;
				aux++;
			}
		}
		for(int h = 0; h < 4; h++){
			for(int w = 0; w < 4; w++){
				if(cor[w] == auxSenha[h] && aux < 4 && auxSenha != null){
					auxSenha[h] = null;
					decod[aux] = 2;
					aux++;
					break;
				}
			}
		}
		for(int w = 0; w < 3; w++){
			if(auxSenha[w] != null && aux < 4){
				decod[aux] = 0;
				aux++;
			}
		}
		return decod;
	}
	
	private void geraSenha(){
		for(int h = 0; h < 4; h++){
			int resultado = gerador.nextInt(6);
			if(resultado <= 0){
				resultSenha[h] = cores.vermelho;
				System.out.println("vermelho ");
			}
			if(resultado > 0 && resultado <= 1){
				resultSenha[h] = cores.azul;
				System.out.println("azul ");
			}
			if(resultado > 1 && resultado <= 2){
				resultSenha[h] = cores.verde;
				System.out.println("verde ");
			}
			if(resultado > 2 && resultado <= 3){
				resultSenha[h] = cores.rosa;
				System.out.println("rosa ");
			}
			if(resultado > 3 && resultado <= 4){
				resultSenha[h] = cores.amarelo;
				System.out.println("amarelo ");
			}
			if(resultado > 4 && resultado <= 5){
				resultSenha[h] = cores.laranja;
				System.out.println("laranja ");
			}
		}
	}
}
