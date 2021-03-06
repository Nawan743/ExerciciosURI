import java.util.Locale;
import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double volume, R;
		
		R = sc.nextDouble();
		
		volume = (4.0/3) * pi * (R * R * R);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();

	}

}
