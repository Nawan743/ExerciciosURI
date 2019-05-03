import java.util.Locale;
import java.util.Scanner;

public class URI1134 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, w;
		y = 0; z = 0; w = 0;
		x= sc.nextInt();
		
		while(x != 4) {
			while(x > 4 || x < 1) {
				x = sc.nextInt();
			}	
			while(x >= 1 && x <=3) {
				if(x == 1) {
					y++;
				}
				else if(x == 2) {
					z++;
				}
				else {
					w++;
				}
				x = sc.nextInt();
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + y);
		System.out.println("Gasolina: " + z);
		System.out.println("Diesel: " + w);
		
		sc.close();
		
	}
}