import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		try(FileWriter writer = new FileWriter("file1", true)) {
			for(int i = 0; i < 3; i++) {
				System.out.println("Entrez votre nom: ");
				String nom = input.nextLine();
				writer.write(nom + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input.close();
	}

}
