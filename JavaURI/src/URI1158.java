import java.util.Scanner;

public class URI1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		int soma = 0;

		for (int i = 0; i < casos; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (y = y; y > 0; y = y - 1) {
				if (x % 2 != 0) {
					soma = soma + x;
					x += 2;
				} else {
					x++;
					y++;
				}
			}
			System.out.println(soma);
			soma = 0;
		}

		sc.close();

	}

}
