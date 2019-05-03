import java.util.Locale;
import java.util.Scanner;

public class URI1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media = 0;
		int resultado=0;
		int y=0;
		
		for(int i=1; i<=6; i++) {
			double x = sc.nextDouble();
			if(x>0) {
				resultado++;
				y++;
				media = media + x;
			}
		}
		
		media = media / y;
		
		System.out.println(resultado + " valores positivos");
		System.out.printf("%.1f\n", media);
		
		sc.close();
		
	}

}
