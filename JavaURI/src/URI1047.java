import java.util.Locale;
import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x1, y1, x2, y2, X, Y;
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		y1 = sc.nextInt();
		y2 = sc.nextInt();
		
		X = y1 - x1;
		if(X < 0) {
			X = 24 + (y1 - x1);
		}
		Y = y2 - x2;
		if(Y < 0) {
			Y = 60 + (y2 - x2);
			X--;
		}
		if(x1 == y1 && x2 == y2) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		else {
			System.out.println("O JOGO DUROU " + X + " HORA(S) E " + Y + " MINUTO(S)");
		}
		
		sc.close();

	}

}
