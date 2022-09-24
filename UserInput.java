import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez un symbole: ");
		char symbol = input.next().charAt(2);
		System.out.println(symbol);
		
//		System.out.println("Entrez Votre nom: ");
//		String nom = input.nextLine();
//		
//		System.out.println("Entrez votre age: ");
//		int age = input.nextInt();
//		
//		input.nextLine();		
//		System.out.println("Entrez Votre adresse: ");
//		String adresse = input.nextLine();
//		
//		
//		System.out.println(nom);
//		System.out.println(age);
//		System.out.println(adresse);
		
		input.close();
	}

}
