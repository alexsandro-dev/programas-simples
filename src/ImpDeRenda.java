import java.util.Locale;
import java.util.Scanner;

public class ImpDeRenda {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu sálario : ");
		double sal = sc.nextDouble();
		
		double imposto;
		
		if (sal <= 2000.0) {
			imposto = 0.0;
		}
		else if(sal <= 3000.0) {
			imposto = (sal - 2000.0) * 0.08;
		}
		else if(sal <= 4500.0) {
			imposto = (sal - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (sal - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		
		else {
			System.out.printf("R$ %.2f%n" , imposto);
		}
	}

}
