import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qnt = sc.nextInt();
		
		double total = 0;
		
		if (cod == 1) {
			total = 4.0 * qnt;
		}
		else {
			if (cod == 2) {
				total = 4.5 * qnt;
			}
			else if(cod == 3) {
				total = 5.0 * qnt;
			}
				else if (cod == 4) {
					total = 2.0 * qnt;
					
				}
				else if (cod == 5) {
					total = 1.5 * qnt;
				}
			
				System.out.printf("O total : R$ %.2f%n " , total);
			}
		sc.close();
		}

	}


