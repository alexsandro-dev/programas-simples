import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n;
		
		System.out.println("Digite um n�mero :");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("O n�mero " + n + " � par");
		}
		else {
			System.out.println("O n�mero " + n + " � �mpar");
		}
		
		sc.close();
	}

}
