import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		double hrt = sc.nextDouble();
		double vhrt = sc.nextDouble();
		
		double sal = hrt * vhrt;
		
		System.out.println("Código do Funcionario : " + code);
		System.out.println();
		System.out.printf("Seu sálario é U$ %.2f%n ", sal);
		
		sc.close();

	}

}
