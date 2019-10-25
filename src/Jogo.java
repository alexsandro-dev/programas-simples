import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hrinicial = sc.nextInt();
		int hrfinal = sc.nextInt();
		int duracao;
		
		if (hrinicial < hrfinal) {
			
			duracao = hrfinal - hrinicial;
		}
		
		else {
			
			duracao = 24 - hrinicial + hrfinal;
		}
		
		System.out.println("O jogo durou : " + duracao + " Hora(s)");
		
		}
		
	
	}


