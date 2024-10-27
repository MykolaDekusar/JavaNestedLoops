import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//I nested loops sono dei loop dentro and altri loop tipo un for dentro un altro for
		Scanner scanner = new Scanner(System.in);
		//chiediamo all'utente il numero di colonne e di righe
		int rows;
		int col;
		String symbol="";
		System.out.println("Inserisci il numero di righe");
		rows=scanner.nextInt();
		System.out.println("Inserisci il numero di colonne");
		col=scanner.nextInt();
		System.out.println("Inserisci il simbolo che vuoi usare per la forma");
		symbol=scanner.next();
		for(int i=0;i<rows;i++) {
			System.out.println();//mi serve per andare a capo ad ogni riga
			for(int j=0;j<col;j++) {
				System.out.print(symbol);
			}
			
		}
		scanner.close();
	}

}
