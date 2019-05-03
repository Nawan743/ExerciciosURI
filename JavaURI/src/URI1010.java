import java.util.Locale;
import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, quant1, quant2;
		double valorPeša1, valorPeša2, totalPagar;
		
		cod1 = sc.nextInt();
		quant1 = sc.nextInt();
		valorPeša1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		valorPeša2 = sc.nextDouble();
		
		totalPagar = (quant1 * valorPeša1) + (quant2 * valorPeša2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);
		
		sc.close();

	}

}