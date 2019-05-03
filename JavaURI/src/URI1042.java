import java.util.Locale;
import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, A2, B2, C2;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		A2 = A;
		B2 = B;
		C2 = C;
		
		if(B2<C2) {
			int aux = B2;
			B2 = C2;
			C2 = aux;
	    }

	    if(A2<B2) {
		   int aux = A2;
		   A2 = B2;
		   B2 = aux;
	    }
	    
	    if(B2<C2) {
	    	int aux = B2;
	    	B2 = C2;
	    	C2 = aux;
	    }
	    
	    
		System.out.println(C2);
		System.out.println(B2);
		System.out.println(A2);
		System.out.println();	
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		sc.close();
		
	}

}
