
public class Methode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		System.out.println(Addition(a, b));
		System.out.println(Addition("La maison ", "est belle!"));
	}
	private static int Addition(int a, int b) {
		int c = a + b;
		return c;
	}
	
	static double Addition(double a, double b) {
		double c = a + b;
		return c;
	}
	
	static double Addition(double a, double b, double c) {
		double d = a + b + c;
		return d;
	}
	
	static String Addition(String a, String b) {
		String c = a + b;
		return c;
	}
}
