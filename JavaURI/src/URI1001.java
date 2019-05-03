import java.util.Scanner;

public class URI1001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, total;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		total = num1 + num2;
		
		System.out.println("X = " + total);
		
		sc.close();

	}

}
