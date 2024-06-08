
public class Main {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		System.out.println(mycar.model);
		System.out.println(mycar.make);
		System.out.println(mycar.year);
		mycar.drive();
		mycar.brake();
		
		
		Car mycar2 = new Car();
		mycar2.brake();
		System.out.println(mycar2.price);
		
		
	}
	
	
}
