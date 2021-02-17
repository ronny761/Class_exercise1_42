import java.util.Scanner;
public class mesima5a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int count=input.nextInt();
			for(int  i=0; i<6; i++) {
				System.out.println(i);
				for(int j=i; j>0 && j<6;j--) {
					System.out.println("X");
				}
				System.out.println("");
			}
		}
	}
