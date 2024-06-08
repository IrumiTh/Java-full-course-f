
public class Main {

	public static void main(String[] args) {
		
		System.out.println(sum(3,4));
		System.out.println(sum(3,4,5));
		System.out.println(sum(3,4,5,6));
		
		
	}
	
	static int sum(int x, int y) {
		System.out.println("This is overloaded method 1");
		return (x+y);
	}
	
	static int sum(int x, int y, int z) {
		System.out.println("This is overloaded method 2");
		return (x+y+z);
	}
	
	static int sum(int x, int y, int z, int w) {
		System.out.println("This is overloaded method 3");
		return (x+y+z+w);
	}

}
