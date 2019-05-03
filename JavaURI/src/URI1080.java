import java.util.Scanner;

public class URI1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maiorvalor = 0;
		int posicao = 0;
		
		for(int i=1; i<=100; i++) {
			int x = sc.nextInt();
			if(maiorvalor>x) {
				maiorvalor = maiorvalor;
				posicao = posicao;
			}
			else {
				maiorvalor = x;
				posicao = i;
			}
		}
		System.out.println(maiorvalor);
		System.out.println(posicao);
		
		sc.close();

	}

}
