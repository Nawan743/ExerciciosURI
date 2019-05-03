import java.util.Locale;
import java.util.Scanner;

public class URI1154 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, y;
		double  media, reg;
        idade = sc.nextInt();
		reg = 0;
		y = 0;
		
		while(idade >= 0) {
			reg = reg + idade;
			idade = sc.nextInt();
			y++;
		}
	
		media = reg / y;
		
		System.out.printf("%.2f\n", media);
		
		sc.close();
		
	}

}
