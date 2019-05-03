import java.util.Scanner;

public class URI1144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int numero = 1;
		
		for(int i=0; i<casos; i++) {
			int quadrado = numero * numero;
			int multiplicacao = numero * quadrado;
			System.out.println(numero + " " + quadrado + " " + multiplicacao);
			quadrado++;
			multiplicacao++;
			System.out.println(numero + " " + quadrado + " " + multiplicacao);
			numero++;
		}
		
		sc.close();

	}

}
