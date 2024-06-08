import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[][]  names = new String[2][2];
		for (int i=0 ; i<2 ; i++ ) {
			for(int j=0 ; j<2 ; j++ ) {
				System.out.print("Enter a name: ");
				names[i][j]= scanner.next();
				
			}
		}
		
		for (int i=0 ; i<names.length ; i++ ) {
			System.out.println();
			for(int j=0 ; j<names[i].length ; j++ ) {
				System.out.print(names[i][j] + " ");
				
			}
		}
		
		
	}

}
