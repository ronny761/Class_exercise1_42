
import java.util.Scanner;
public class mesima6b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int count=input.nextInt();
			for(int  i=2; i<7; i++) {
		
				for(int j=i; j>0 && j<7;j--) {
					System.out.println(j);
				}
				System.out.println("");
			}
		}
}
