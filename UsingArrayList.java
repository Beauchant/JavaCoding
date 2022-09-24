import java.util.ArrayList;

public class UsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nom = new ArrayList<String>();
		nom.add("Marie");
		nom.add("Pierre");
		nom.add(0, "Jean");
		
		System.out.println(nom);
		System.out.println(nom.get(0));
		nom.set(0, "Jacques");
		System.out.println(nom);
		
		
	}

}
