import java.util.Locale;
import java.util.Scanner;

public class URI1043 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, area, peri;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if(A > 0 && B > 0 && C > 0 && A < B+C && B < A+C && C < B+A) {
			peri = A + B + C;
			System.out.printf("Perimetro = %.1f\n", peri);		
		}
		else {
			area = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n", area);
		}
		
		sc.close();
		
	}

}