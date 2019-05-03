import java.util.Locale;
import java.util.Scanner;

public class URI1051 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imp1, imp2 , imp3, total;
		salario = sc.nextDouble();
		
		if(salario > 0 && salario <= 2000) {
			System.out.println("Isento");
		}
		else {
			if(salario > 2000 && salario <= 3000) {
				imp1 = (salario - 2000) * 0.08;
				total = imp1;
			}
			else if(salario > 3000 && salario <= 4500) {
				
				imp2 =  80 + ((salario - 3000) * 0.18);
				total = imp2;
			}
			else {
			    imp3 = 350 + ((salario - 4500) * 0.28);
			    total = imp3;
			}
			
			System.out.printf("R$ %.2f\n", total);
		}
		
		sc.close();

	}

}