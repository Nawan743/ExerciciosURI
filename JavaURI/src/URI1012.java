import java.util.Locale;
import java.util.Scanner;

public class URI1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTri, areaCirc, areaTrap, areaQuad, areaRet;
		double pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTri = A * C / 2;
		areaCirc = (C * C) * pi;
		areaTrap = (A + B) * C / 2;
		areaQuad = B * B;
		areaRet = B * A;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTri);
		System.out.printf("CIRCULO: %.3f%n", areaCirc);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
		System.out.printf("QUADRADO: %.3f%n", areaQuad);
		System.out.printf("RETANGULO: %.3f%n", areaRet);
		
		sc.close();
		
	}

}