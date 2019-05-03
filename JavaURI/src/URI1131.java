import java.util.Scanner;

public class URI1131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int gremio = 0;
		int inter = 0;
		int empate = 0;
		int totalGrenais=0;
		
		while(x==1) {
			int placInter = sc.nextInt();
			int placGremio = sc.nextInt();
			if(placGremio>placInter) {
				gremio++;
			}
			else if(placInter>placGremio) {
				inter++;
			}
			else {
				empate++;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			x = sc.nextInt();
			totalGrenais++;
		}
		
		System.out.println(totalGrenais + " grenais");
		System.out.println("Inter:" + inter);
		System.out.println("Gremio:" + gremio);
		System.out.println("Empates:" + empate);
		
		if(inter>gremio) {
			System.out.println("Inter venceu mais");
		}
		else if(gremio>inter) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
		
		sc.close();

	}

}
