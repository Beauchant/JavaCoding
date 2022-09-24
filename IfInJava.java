
public class IfInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 23;
		
		if(age < 18) {
			System.out.println("Mineur");
		}
		else if(age >= 18 && age <= 50) {
			System.out.println("Adulte");
		}
		else {
			System.out.println("Viellard");
		}
		
	}

}
