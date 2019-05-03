import java.util.Scanner;

public class URI1153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = 1;
		int resultado = 0;
		
		for(y = 1; x>=1; x--) {
			resultado = x;
			y = y * resultado;
		}
		
		System.out.println(y);
		
		sc.close();

	}

}
