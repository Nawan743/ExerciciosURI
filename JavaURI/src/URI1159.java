import java.util.Scanner;

public class URI1159 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int reg = 0;
		
		while(x != 0) {
			if(x % 2 == 0) {
				reg = x + (x+2) + (x+4) + (x+6) + (x+8);

			}
			else {
				reg = (x+1) + (x+3) + (x+5) + (x+7) + (x+9);
			}
			System.out.println(reg);
			x = sc.nextInt();
		}
		
		sc.close();
		
	}

}
