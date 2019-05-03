import java.util.Locale;
import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String palav1, palav2, palav3;
		palav1 = sc.next();
		palav2 = sc.next();
		palav3 = sc.next();
		
		if(palav1.equals("vertebrado")) {
			if(palav2.equals("ave")) {
				if(palav3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else if(palav3.equals("onivoro")) {
					System.out.println("pomba");
				}
			}
			else if(palav2.equals("mamifero")) {
				if(palav3.equals("onivoro")) {
					System.out.println("homem");
				}
				else if(palav3.equals("herbivoro")) {
					System.out.println("vaca");
				}
			}
		}
		else if(palav1.equals("invertebrado")){
			if(palav2.equals("inseto")) {
				if(palav3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else if(palav3.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			}
			else if(palav2.equals("anelideo")) {
				if(palav3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else if(palav3.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}

		}
		
		sc.close();
		
	}

}
