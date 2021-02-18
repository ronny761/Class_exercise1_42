import java.util.Scanner;
public class mesima5b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int count=input.nextInt();
			for(int  i=1; i<6; i++) {
		
				for(int j=i; j>0 && j<6;j--) {
					System.out.println(j);
				}
				System.out.println("");
			}
		}
}
