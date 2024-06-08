
public class Main {

	public static void main(String[] args) {
		
		String name = "IRUMI";
		int age = 23;
		hello(name, age);
		
		
		int x=3;
		int y=4;
		System.out.println(sum(x,y));
		
		
	}
	static void hello(String name, int a) {
		System.out.println("Hello, "+name);
		System.out.println("you are "+a);
	}
	
	static int sum(int x, int y) {
		return (x+y);
	}

}
