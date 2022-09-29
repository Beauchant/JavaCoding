import java.io.File;

public class FileInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "Test2";
//		String path1 = "C:\\Users\\beauc\\OneDrive\\Documents\\Java Programing\\UEspoir Java1\\Docs\\Test2.txt";
		String path1 = "C:/Users/beauc/OneDrive/Documents/Java Programing/UEspoir Java1/Docs/Test2.txt";
		File fichier = new File(path1);
		
		System.out.println(fichier.getAbsolutePath());
		System.out.println(fichier.isFile());
		
//		if(fichier.exists()) {
//			System.out.println("Le fichier existe!");
//		}
//		else {
//			System.out.println("Le fichier n'existe pas!");
//		}
		
	}

}
