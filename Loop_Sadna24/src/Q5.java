import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i=1; i<6; i++) {
			System.out.print(i);
			for(int a=0; a<i; a++)
				System.out.print("X");
			System.out.println(" ");
		}
		
	}
}
