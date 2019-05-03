import java.util.Locale;
import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float N1, N2, N3, N4, NotaExame, Media, Media2;
		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		N3 = sc.nextFloat();
		N4 = sc.nextFloat();
		
		Media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
		
		if (Media >= 7.0) {
			System.out.printf("Media: %.1f\n", Media);
			System.out.println("Aluno aprovado.");
		}
		else if (Media < 5.0) {
			System.out.printf("Media: %.1f\n", Media);
			System.out.println("Aluno reprovado.");
		}
		else {
			System.out.printf("Media: %.1f\n", Media);
			System.out.println("Aluno em exame.");
			NotaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", NotaExame);
			Media2 = (Media + NotaExame) / 2;
			
			if(Media2 >= 5.0) {
				System.out.println("Aluno aprovado.");
				
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			
			System.out.printf("Media final: %.1f\n", Media2);
		}
		
		sc.close();
		
	}

}