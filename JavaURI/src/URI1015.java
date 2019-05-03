import java.util.Locale;
import java.util.Scanner;

public class URI1015 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1, y1, x2, y2, Distancia;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		Distancia = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
		
		System.out.printf("%.4f%n", Distancia);
		
		sc.close();
		
	}

}
