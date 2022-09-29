import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path1 = "C:/Users/beauc/OneDrive/Documents/Java Programing/UEspoir Java1/Docs/Test2.txt";
		try(FileReader file = new FileReader(path1)) {
//			FileReader file = new FileReader(path1);
			int data = file.read();
			
			while(data != -1) {
				System.out.print((char)data);
				data = file.read();
			}

//			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
