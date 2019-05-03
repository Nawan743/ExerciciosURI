import java.util.Locale;
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int kmL = 12;
        double tempo, velMed, CombGast;
        
        tempo = sc.nextDouble();
        velMed = sc.nextDouble();
        
        CombGast = tempo * (velMed / kmL);
        
        System.out.printf("%.3f%n", CombGast);
        
        sc.close();
		
	}

}
