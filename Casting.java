
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nbre = "34";
		float pi = 3.14f;
		
		int nbrePi = (int)pi;
		System.out.println(nbrePi);
		
		int nbre1 = Integer.parseInt(nbre);
		System.out.println(nbre1);
		
		String nbre2 = Integer.toString(nbre1);
		System.out.println(nbre2);

	}
}
