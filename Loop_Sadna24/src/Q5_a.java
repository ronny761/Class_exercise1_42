
public class Q5_a {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i = i + 1) {
			System.out.print(i);
			for (int x = i; x != 0 ; x = x - 1) {
				System.out.print("x");
			}
			System.out.println();
		}

	}

}
