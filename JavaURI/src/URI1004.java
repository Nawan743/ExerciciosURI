import java.util.Scanner;

public class URI1004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, PROD;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		PROD = num1 * num2;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();

	}

}
