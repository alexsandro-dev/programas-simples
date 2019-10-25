import java.util.Locale;
import java.util.Scanner;

public class Pecas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codp1 = sc.nextInt();
		int npec1 = sc.nextInt();
		double vunit1 = sc.nextDouble();
		int codp2 = sc.nextInt();
		int npec2 = sc.nextInt();
		double vunit2 = sc.nextDouble();
		
		double v1 = npec1 * vunit1;
		double v2 = npec2 * vunit2;
		double v3 = v1 + v2;
		
		System.out.println("O valor da peça " + codp1 + " é de : " + v1);
		System.out.println("O valor da peca " + codp2 + " é de : " + v2);
		System.out.printf("O valor total de sua compra é R$ %.2f%n ", v3);
		
		sc.close();

	}

}
