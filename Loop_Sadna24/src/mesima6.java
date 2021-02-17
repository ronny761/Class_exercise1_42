
import java.util.Scanner;
public class mesima6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int count=input.nextInt();
			for(int i=count; i>0;i--) {
				System.out.println(i);
				for(int j=i; j>0;j--) {
					System.out.println("X");
				}
				System.out.println(""); 
			}
		}
	}
