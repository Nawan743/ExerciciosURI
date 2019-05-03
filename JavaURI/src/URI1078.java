import java.util.Scanner;

public class URI1078 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int resultado = i * N;
			System.out.println(i + " x " + N + " = " + resultado);
		}
		
		sc.close();
		
	}

}
