import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n;
		
		System.out.println("Digite um número :");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("O número " + n + " é par");
		}
		else {
			System.out.println("O número " + n + " é ímpar");
		}
		
		sc.close();
	}

}
