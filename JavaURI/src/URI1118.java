import java.util.Locale;
import java.util.Scanner;

public class URI1118 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, media;
		int novocalculo = 1;
		a = 0;
		b = 0;
		
		while(novocalculo != 2)  {
			a = sc.nextDouble();
			b = sc.nextDouble();
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
			media = (a + b) / 2;
			System.out.printf("media = %.2f\n", media);
			System.out.println("novo calculo (1-sim 2-nao)");
			novocalculo = sc.nextInt();
			while(novocalculo != 1 && novocalculo != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				novocalculo = sc.nextInt();
			}
		}
		
	    sc.close();
		
	}

}