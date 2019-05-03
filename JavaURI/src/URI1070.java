import java.util.Scanner;

public class URI1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero%2==0) {
			numero = numero + 1;
			int imparfinal = numero;
			System.out.println(imparfinal);
			for(int i = 1; i<6; i++) {
				imparfinal += 2;
				System.out.println(imparfinal);
			}
		}
		else {
			int imparfinal = numero;
			System.out.println(imparfinal);
			for(int i = 1; i<6; i++) {
				imparfinal += 2;
				System.out.println(imparfinal);
			}
		}
		
		sc.close();

	}

}
