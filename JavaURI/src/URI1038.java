import java.util.Locale;
import java.util.Scanner;

public class URI1038 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Cod, Quant;
		double total, valor;
		
		Cod = sc.nextInt();
		Quant = sc.nextInt();
		
		if (Cod == 1) {
			valor = 4.00;
		}
		else if (Cod == 2) {
			valor = 4.50;
		}
		else if (Cod == 3) {
			valor = 5.00;
		}
		else if (Cod == 4) {
			valor = 2.00;
		}
		else {
			valor = 1.50;
		}
		
		total = valor * Quant;
		
		System.out.printf("Total: R$ %.2f\n", total);
		
		sc.close();
				
	}

}
