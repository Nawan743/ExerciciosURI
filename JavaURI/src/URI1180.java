import java.util.Scanner;

public class URI1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int menorvalor = 0;
		int posi = 0;
		
		for(int i=0;i<casos;i++) {
			int x = sc.nextInt();
			if(menorvalor<x) {
				menorvalor = menorvalor;
				posi = posi;
			}
			else {
				menorvalor = x;
				posi = i;
			}
		}
		
		System.out.println("Menor valor: " + menorvalor);
		System.out.println("Posicao: " + posi);
		
		sc.close();
		
	}

}
