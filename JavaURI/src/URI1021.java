import java.util.Locale; 
import java.util.Scanner;

public class URI1021 {
   
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float x, y;
		int nota100, nota50, nota20, nota10, nota5, nota2;
		int moeda1, moeda50, moeda25, moeda10, moeda5, moeda01;
		int resto;
		
		x = sc.nextFloat();
		
		y = x * 100;
		
		nota100 = (int) y / 10000;
		resto = (int) y % 10000;
		nota50 = (int) resto / 5000;
		nota20 = (int) (resto % 5000) / 2000;
		nota10 = (int) ((resto % 5000) % 2000) / 1000;
		nota5 = (int) (((resto % 5000) % 2000) % 1000) / 500;
		nota2 = (int) ((((resto % 5000) % 2000) % 1000) % 500) / 200;
		
		moeda1 = (int) (((((resto % 5000) % 2000) % 1000) % 500) % 200) / 100;
		float restomoeda = (float) ((((((resto % 5000) % 2000) % 1000) % 500) % 200) % 100);
		
		
	    moeda50 = (int) restomoeda / 50;
		moeda25 = (int) (restomoeda % 50) / 25;
		moeda10 = (int) ((restomoeda % 50) % 25) / 10;
		moeda5 =  (int) (((restomoeda % 50) % 25) % 10) / 5;
		moeda01 = (int) ((((restomoeda % 50) % 25) % 10) % 5) / 1;
		
		System.out.println("NOTAS:");
		System.out.println(nota100 + " nota(s) de R$ 100.00");
		System.out.println(nota50 + " nota(s) de R$ 50.00");
		System.out.println(nota20 + " nota(s) de R$ 20.00");
		System.out.println(nota10 + " nota(s) de R$ 10.00");
		System.out.println(nota5 + " nota(s) de R$ 5.00");
		System.out.println(nota2 + " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println(moeda1 + " moeda(s) de R$ 1.00");
		System.out.println(moeda50 + " moeda(s) de R$ 0.50");
		System.out.println(moeda25 + " moeda(s) de R$ 0.25");
		System.out.println(moeda10 + " moeda(s) de R$ 0.10");
		System.out.println(moeda5 + " moeda(s) de R$ 0.05");
		System.out.println(moeda01 + " moeda(s) de R$ 0.01");
		
		sc.close();
		
	}

}