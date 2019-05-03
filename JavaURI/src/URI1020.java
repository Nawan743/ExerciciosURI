import java.util.Locale;
import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idadedias, anos, meses, dias, resto;
		idadedias = sc.nextInt();
		
		anos = idadedias / 365;
		resto = idadedias % 365;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();

	}

}