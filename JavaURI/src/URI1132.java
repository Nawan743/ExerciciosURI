import java.util.Scanner;

public class URI1132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
		
		int min = (x < y) ? x : y;
		int max = (x > y) ? x : y;
		
		for(int i=min; i<=max; i++) {
			if(i%13!=0) {
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}

}
