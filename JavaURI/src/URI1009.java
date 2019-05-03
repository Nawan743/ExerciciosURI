import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String vendedor;
		double salario, totalVendas, totalReceber;
		
	    vendedor = sc.next();
	    salario = sc.nextDouble();
	    totalVendas = sc.nextDouble();
	    
	    totalReceber = salario + (totalVendas * 15 / 100);
	    
	    System.out.printf("TOTAL = R$ %.2f%n", totalReceber);
	    
	    sc.close();
	    
	}

}