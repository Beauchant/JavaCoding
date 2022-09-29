import java.util.HashMap;
public class Dictionnay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> dico = new HashMap<String, Integer>();
		dico.put("Math", 75);
		dico.put("Anglais", 70);
		dico.put("Biologie", 80);
		
//		System.out.println(dico.toString());
		System.out.println(dico.get(75));
		//Get all keys in the dictionary
		System.out.println(dico.keySet());
		//Get all values in the dictionary
		System.out.println(dico.values());
		System.out.println(dico.replace("Math", 90));
		
		System.out.println(dico.remove(75));
		System.out.println(dico.toString());
	}

}
