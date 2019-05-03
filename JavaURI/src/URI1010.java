import java.util.Locale;
import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, quant1, quant2;
		double valorPe�a1, valorPe�a2, totalPagar;
		
		cod1 = sc.nextInt();
		quant1 = sc.nextInt();
		valorPe�a1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		valorPe�a2 = sc.nextDouble();
		
		totalPagar = (quant1 * valorPe�a1) + (quant2 * valorPe�a2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);
		
		sc.close();

	}

}