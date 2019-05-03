import java.util.Scanner;

public class URI1142 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int numero = 1;
		for(int i = 0; i<casos; i++) {
			System.out.print(numero + " ");
			numero++;
			System.out.print(numero + " ");
			numero++;
			System.out.print(numero + " ");
			numero++;
			System.out.println("PUM");
			numero++;
		}
		
		sc.close();

	}

}
