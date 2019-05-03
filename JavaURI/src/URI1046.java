import java.util.Locale;
import java.util.Scanner;

public class URI1046 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, Duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			Duracao = horaFinal - horaInicial;
		
		}
		else {
			Duracao = 24 - horaInicial + horaFinal;
			
		}
		
		System.out.println("O JOGO DUROU " + Duracao + " HORA(S)");
		
		sc.close();

	}

}