import java.util.Locale;
import java.util.Scanner;

public class URI1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int resultado=0;
		
		for(int i=1; i<=6; i++) {
			double x = sc.nextDouble();
			if(x>0) {
				resultado++;
			}
		}
		
		System.out.println(resultado + " valores positivos");
		
		sc.close();
		
	}

}
