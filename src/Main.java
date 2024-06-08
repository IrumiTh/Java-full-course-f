import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		Numbers.add(23);
		Numbers.add(40);
		Numbers.add(57);
		
		Numbers.set(0, 80);
		Numbers.remove(0);
		
		
		for(int i=0; i< Numbers.size();i++) {
			System.out.println(Numbers.get(i));
		}
		
	}

}
