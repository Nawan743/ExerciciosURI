import java.util.Locale;
import java.util.Scanner;

public class URI1114 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int senha;
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
		
	}

}