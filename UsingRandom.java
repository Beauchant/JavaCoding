import java.util.Random;

public class UsingRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String[] nom = {"Pierre", "Martin", "Jacques"};
		
		for(int i = 0; i < 10; i++) {
			int nbre = random.nextInt(100);
			System.out.println(nbre);
		}
		
		int choix = random.nextInt(nom.length);
		System.out.println(nom[choix]);
		int n = random.nextInt(nom.length);
		System.out.println(nom[n]);
	}
}
