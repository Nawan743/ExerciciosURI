import java.util.Scanner;

public class URI1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int exibicao = 0;
		
		while(exibicao<y) {
			exibicao++;
			for(int i=1; i<x; i++) {
				System.out.printf("%d ", exibicao);
				exibicao++;
			}
			System.out.println(exibicao);
		}
		
		sc.close();

	}

}
