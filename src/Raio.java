import java.util.Locale;
import java.util.Scanner;

public class Raio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double Pi = 3.14159;
		double area;
		
		
		area = Pi * x * x;
		
		System.out.printf("O valor do área do raio é %.4f%n ", area);
		
		sc.close();
		
	}

}
