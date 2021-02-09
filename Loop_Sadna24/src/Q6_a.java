
public class Q6_a {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i = i - 1) {
			System.out.print(i);
			for (int x = i; x != 0; x = x - 1) {
				System.out.print("x");
			}
			System.out.println();
		}

	}

}
