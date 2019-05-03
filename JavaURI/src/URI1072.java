import java.util.Scanner;

public class URI1072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int contagem1 = 0;
		int contagem2 = 0;
		
		for(int i=0; i<casos; i++) {
			int x = sc.nextInt();
			if(x<=20 && x>=10) {
				contagem1 += 1;
			}
			else {
				contagem2 += 1;
			}
		}
		System.out.println(contagem1 + " in");
		System.out.println(contagem2 + " out");
		
		sc.close();
		
	}

}