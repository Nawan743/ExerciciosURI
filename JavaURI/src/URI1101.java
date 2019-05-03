import java.util.Scanner;

public class URI1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		while(M > 0 && N > 0) {
			int min =(M < N) ? M : N;
			int max =(M > N) ? M : N;
			
			int soma = 0;
			
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
				soma = soma + i;
			}
			System.out.println("Sum=" + soma);
			
			M = sc.nextInt();
			N = sc.nextInt();
			
		}
		
		sc.close();

	}

}
