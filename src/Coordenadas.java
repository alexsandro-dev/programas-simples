import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite as coordenadas");
		System.out.println("Primeira Coordenda :");
		double a = sc.nextDouble();
		System.out.println("Segunda Coordenada :");
		double b = sc.nextDouble();
		
		if (a == 0 && b == 0) {
			System.out.println("Coordenadas na Origem");
		}
		else if (a > 0 && b > 0) {
			System.out.println(" 1� quadrante");
		}
		else if (a < 0 && b > 0) {
			System.out.println(" 2� quadrante");
		}
		else if (a < 0 && b < 0) {
			System.out.println(" 3� quadrante");
		}
		else if (a > 0 && b < 0) {
			System.out.println(" 4� quadrante");
		}
		
		sc.close();
	}

}
