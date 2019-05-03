import java.util.Scanner;

public class URI1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int par = 1;
		
		for(int i=1; i<=N; i++) {
			int quadrado = par * par;
			if(par%2==0) {
				System.out.println(par + "^2 = " + quadrado);
			}
			par++;
		}
		
		sc.close();

	}

}
