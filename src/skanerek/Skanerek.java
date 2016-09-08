package skanerek;
import java.util.Scanner;
public class Skanerek {

	public static void main(String[] args) {
		Scanner klawiaturka = new Scanner(System.in);
		
		double waga;
		int planeta;
		
		czyOlaJestGlupia();

		
		System.out.println("Ile wazysz? ");
		waga = klawiaturka.nextDouble();
		System.out.println
		("Wpisz odpowiednia liczbe,by sprawdzic ile wazysz na innej planecie: 1.Merkury 2.Wenus 3.Mars 4.Jowisz");
		planeta = klawiaturka.nextInt();

		switch(planeta){
		case 1: waga/=0.75;
			System.out.println("Na Merkurym wazylbys: "+(Math.round(waga)));
			break;
		case 2: waga/=0.5;
			System.out.println("Na Wenus wazylbys: "+(Math.round(waga)));
			break;
		case 3: waga/=0.1;
		
			System.out.println("Na Marsie wazylbys: "+(Math.round(waga)));
			break;
		case 4: waga/=1.5;
	
			System.out.println("Na Jowiszu wazylbys: "+(Math.round(waga)));
			break;
		}

	}

	private static void czyOlaJestGlupia() {
		System.out.println("Czy Ola jest g³upia? Oczywiœcie, ¿e tak");
		
	}

}
