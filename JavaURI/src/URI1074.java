import java.util.Scanner;

public class URI1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i=0; i<casos; i++) {
			int x = sc.nextInt();
			if(x==0) {
				System.out.println("NULL");
			}
			else if(x % 2 !=0){
				System.out.print("ODD ");
			}
			else {
				System.out.print("EVEN ");
			}
			if(x>0) {
				System.out.println("POSITIVE");
			}
			else if(x<0) {
				System.out.println("NEGATIVE");
			}
		}
		
		sc.close();
		
	}

}
