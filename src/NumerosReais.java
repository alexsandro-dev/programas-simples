import java.util.Scanner;

public class NumerosReais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um n�mero");
		n = sc.nextInt();
		
		if (n < 0) {
			
			System.out.println("O N�mero " + n + " � negativo");
		} else {
			
				if (n > 0) {
					System.out.println("O N�mero " + n + " � positivo");
				}else
					System.out.println("Esse numero � n�o negativo ");
			
		}
		
		sc.close();

	}

}
