import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite um numero: ");
		
		double numero1 = sc.nextDouble();
				
		
		if (numero1 >=0 && numero1 < 25.0) {
			System.out.println("O número " + numero1 + " esta entre o intervalo de [0,25]");
		}
		else if (numero1 >=25.01 && numero1 <= 50.0) {
			System.out.println("O número " + numero1 + " esta entre o intervalo de [25,50]");
		}
		else if (numero1 >= 50.01 && numero1 <= 75.0) {
			System.out.println("O número " + numero1 + " esta entre o intervalo de [50,75]");
		}
		
		else if (numero1 >= 75.01 && numero1 <= 100.0) {
			System.out.println("O número " + numero1 + " esta entre o intervalo de [75,100]");
		}

		else {
			System.out.println("Número fora dos intervalos");
		}
		
		sc.close();
	}

}
