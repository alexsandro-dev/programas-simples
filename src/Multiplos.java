import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, n;
		
		System.out.println("Digite o primeiro n�mero :");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero :");
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			
			System.out.println("Eles s�o multiplos");
		}
		else {
			System.out.println("Eles n�o sao multiplos");
		}
		
		sc.close();
	}

}
