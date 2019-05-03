import java.util.Locale;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int DistPerc;
		double CombGast, ConsMed;

		DistPerc = sc.nextInt();
		CombGast = sc.nextDouble();
		
		ConsMed = DistPerc / CombGast;
		
		System.out.printf("%.3f km/l%n", ConsMed);
		
		sc.close();
		
	}

}