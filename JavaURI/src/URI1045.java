import java.util.Locale;
import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N1, N2, N3;
		N1 = sc.nextDouble();
		N2 = sc.nextDouble();
		N3 = sc.nextDouble();
		
		double A, B, C;
		
		if(N1 > N2 && N1 > N3) {
			A = N1;
			if(N2 > N3) {
				B = N2;
				C = N3;
			}
			else {
				B = N3;
				C = N2;
			}
		}
		else if(N2 > N1 && N2 > N3) {
			A = N2;
			if(N1 > N3) {
				B = N1;
				C = N3;
			}
			else {
				B = N3;
				C = N1;
			}
		}
		else {
			A = N3;
			if(N1 > N2) {
				B = N1;
				C = N2;
			}
			else {
				B = N2;
				C = N1;
			}
		}
		
		if(A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			else if (Math.pow(A, 2) > Math.pow(B,2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			
			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			else if(A == B || B == C || C == A) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		sc.close();

	}

}
