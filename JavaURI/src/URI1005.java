import java.util.Locale;
import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, media;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		double x = A * 3.5;
		double y = B * 7.5;
		media = (x + y) / 11;
		
		System.out.printf("MEDIA = %.5f%n", media);

		sc.close();
		
	}

}