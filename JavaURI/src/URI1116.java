import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i=0; i<casos; i++) {
			int x = sc.nextInt();
			double y = sc.nextDouble();
			if(y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double resultado = x / y;
				System.out.println(resultado);
			}
		}
		
		sc.close();
		
	}

}