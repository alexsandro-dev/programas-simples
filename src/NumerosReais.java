import java.util.Scanner;

public class NumerosReais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um número");
		n = sc.nextInt();
		
		if (n < 0) {
			
			System.out.println("O Número " + n + " é negativo");
		} else {
			
				if (n > 0) {
					System.out.println("O Número " + n + " é positivo");
				}else
					System.out.println("Esse numero é não negativo ");
			
		}
		
		sc.close();

	}

}
