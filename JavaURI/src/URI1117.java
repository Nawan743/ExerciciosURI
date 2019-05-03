import java.util.Locale;
import java.util.Scanner;

public class URI1117 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, media;
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if(!(a >= 0 && a <= 10) || !(b >= 0 && b <= 10)) {
			while(!(a >= 0 && a <= 10) || !(b >= 0 && b <= 10)) {
				if(!(a >= 0 && a <= 10)) {
					System.out.println("nota invalida");
					a = sc.nextDouble();
				}
				else if(!(b >= 0 && b <= 10)) {
					System.out.println("nota invalida");
					b = sc.nextDouble();
				}
			}
		}
		
		media = (a + b) / 2;
		System.out.printf("media = %.2f\n", media);
		
	    sc.close();
		
	}

}