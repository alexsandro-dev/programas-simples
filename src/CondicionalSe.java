import java.util.Scanner;

public class CondicionalSe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Qual é a hora ?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			
			System.out.println("Bom dia");
		}
		else {
			
			if(hora > 12 && hora < 18) {
				System.out.println("Boa Tarde");
			}
			
			else {
				System.out.println("Boa noite");
			}
		}
		
		sc.close();
	}

}
