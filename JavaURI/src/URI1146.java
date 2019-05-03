import java.util.Scanner;

public class URI1146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		while(numero!=0) {
			int exibicao = 1;
			for(int i =1;i <= numero; i++) {
				if(exibicao< numero) {
					System.out.print(exibicao + " ");
					exibicao++;
				}
				else {
					System.out.println(exibicao);
				}
			}
			numero = sc.nextInt();
		}
		
		sc.close();

	}

}
