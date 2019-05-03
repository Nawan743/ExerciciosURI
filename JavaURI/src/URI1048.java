import java.util.Locale;
import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double atualSalario, novoSalario, reajuste;
		int porcentagem;
		atualSalario = sc.nextDouble();
		
		if(atualSalario <= 400) {
			
			porcentagem = 15;
			novoSalario =  atualSalario + (atualSalario * porcentagem / 100);
		    reajuste = atualSalario * porcentagem / 100;
					
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: " + porcentagem + " %");
		}
		else if (atualSalario > 400 && atualSalario <= 800) {
			
			porcentagem = 12;
			novoSalario = atualSalario + (atualSalario * porcentagem / 100);
			reajuste = atualSalario * porcentagem / 100;
					
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: " + porcentagem + " %");
		}
		else if (atualSalario > 800 && atualSalario <= 1200) {
			
			porcentagem = 10;
			novoSalario = atualSalario + (atualSalario * porcentagem / 100);
			reajuste = atualSalario * porcentagem / 100;
					
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: " + porcentagem + " %");
		}
		else if (atualSalario > 1200 && atualSalario <= 2000) {
			
			porcentagem = 7;
			novoSalario = atualSalario + (atualSalario * porcentagem / 100);
			reajuste = atualSalario * porcentagem / 100;
					
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: " + porcentagem + " %");
		}
		else if (atualSalario > 2000) {
			
			porcentagem = 4;
			novoSalario = atualSalario + (atualSalario * porcentagem / 100);
			reajuste = atualSalario * porcentagem / 100;
					
			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: " + porcentagem + " %");
		}
		
		sc.close();
		
	}

}