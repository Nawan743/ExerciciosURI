import java.util.Locale;
import java.util.Scanner;

public class URI1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, R1, R2;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if(A == 0 || (Math.pow(B, 2) - (4 * A * C)) < 0) {
			System.out.println("Impossivel calcular");
		}
		else {
			R1 = (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
			R2 = (-B - Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
			
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}
		
		sc.close();
		
	}

}