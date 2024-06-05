
public class Main {

	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		int q = 10;
		
		double z = Math.min(x, y);
		System.out.println(z);
		
		z = Math.max(x, y);
		System.out.println(z);
		
		z = Math.abs(y);
		System.out.println(z);
		
		z = Math.sqrt(q);
		System.out.println(z);
		
		z = Math.round(x);
		System.out.println(z);
		
		z = Math.ceil(x);
		System.out.println(z);
		
		z = Math.floor(x);
		System.out.println(z);
	}

}
