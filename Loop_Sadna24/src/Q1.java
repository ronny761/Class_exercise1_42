import java.util.Iterator;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter store amount");
		int stores = s.nextInt();
		int maxTotal=0, price=0;
		
		for (int i = 0; i < stores; i++) {
			
			int  totalPrice=0;
			for (int j = 0; j < 5; j++) {
				System.out.println("enter pen price");
				price = s.nextInt();
				totalPrice += price;
				
			}
			//to
			
		}
		

	}

}
