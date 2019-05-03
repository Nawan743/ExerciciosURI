import java.util.Locale;
import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

	    int MaiorAB = (a+b+Math.abs(a-b))/2;
	    int MaiorABC = (MaiorAB+c+Math.abs(MaiorAB-c))/2;
		
		System.out.println(MaiorABC + " eh o maior");
		
		sc.close();
		
	}

}