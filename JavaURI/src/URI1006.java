import java.util.Locale;
import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, media;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C= sc.nextDouble();
		
		double x = A * 2;
		double y = B * 3;
		double z = C * 5;
		media = (x + y + z) / 10;
		
		System.out.printf("MEDIA = %.1f%n", media);

		sc.close();
	}

}