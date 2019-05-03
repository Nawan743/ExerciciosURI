import java.util.Locale;
import java.util.Scanner;

public class URI1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String tipoCobaia;
		int casos =sc.nextInt();
		int coelho=0;
		int rato=0;
		int sapo=0;
		int totalCobaia=0;
		
		for(int i =0; i<casos; i++) {
			int quantCobaia = sc.nextInt();
			tipoCobaia = sc.next();
			totalCobaia = totalCobaia + quantCobaia;
			if(tipoCobaia.equals("C")) {
			    coelho = coelho + quantCobaia;
			}
			else if(tipoCobaia.equals("R")) {
				rato = rato + quantCobaia;
			}
			else if(tipoCobaia.equals("S")) {
				sapo = sapo + quantCobaia;
			}
		}
		double porcentagemcoelho = (double) (coelho * 100.0) / totalCobaia;
		double porcentagemrato = (double) (rato * 100.0) / totalCobaia;
		double porcentagemsapo = (double) (sapo * 100.0) / totalCobaia;
		
		System.out.println("Total: " + totalCobaia + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		System.out.printf("Percentual de coelhos: %.2f %%\n", porcentagemcoelho);
		System.out.printf("Percentual de ratos: %.2f %%\n", porcentagemrato);
		System.out.printf("Percentual de sapos: %.2f %%\n", porcentagemsapo);
		
		sc.close();

	}

}