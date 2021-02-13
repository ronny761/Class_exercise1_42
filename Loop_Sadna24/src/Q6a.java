import java.util.Scanner;

public class Q6a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i=5; i>0; i--) {
			System.out.print(i);
			for(int a=0; a<i; a++)
				System.out.print("X");
			System.out.println(" ");
	}

	}

}
