import java.util.Locale;

public class Loja {

	public static void main(String[] args) {
		String prod1 = "Computador";
		String prod2 = "Desk Office";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		
		System.out.println("Produtos:");
		System.out.println();	
		System.out.printf("Computador, seu pre�o � %.2f%n", preco1);
		System.out.printf("Desk Office, seu pre�o � %.2f%n", preco2);
		System.out.println();
		System.out.printf("Registro: %d anos de idade, c�digo %d and g�nero: %s",age,code,gender);
		System.out.println();
		System.out.printf("A medida at� a oitava casa decimal: %.8f%n", medida);
		System.out.printf("A medida at� a terceira casa decimal: %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("A medida at� a terceira casa decimal nos USA: %.3f%n", medida);

	}

}
