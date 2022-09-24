import java.util.Scanner;

public class SwitchInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le jour: ");
		String jour = input.nextLine();
		
		switch(jour) {
		case "Dimanche":
			System.out.println("Aujourd'hui est " + jour);
			break;
		case "Lundi":
			System.out.println("Aujourd'hui est " + jour);
			break;
		case "Mardi":
			System.out.println("Aujourd'hui est " + jour);
			break;
		default:
			System.out.println("InvalidJ");
			break;
		}
	}

}
