import java.util.Scanner;

public class URI1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int par=0;
		int impar=0;
		int positivo=0;
		int negativo=0;
		
		for(int i=1; i<=5; i++) {
			int x = sc.nextInt();
			if(x%2==0) {
				par++;
			}
			else {
				impar++;
			}
			if(x>0) {
				positivo++;
			}
			else if(x<0) {
				negativo++;
			}
		}
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		
		sc.close();
		
	}

}
