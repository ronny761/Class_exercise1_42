import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0, sum = 0, b = 0, m = 0, k = 0;
		for (int i = 0; i < 3; i++) {
			a = 0; b=0; sum=0;
			while (a != -1) {
				System.out.println("Enter your mark");
				a = input.nextInt();
				if (a != -1) {
					sum = sum + a;
					b++;
				}
			}
			m = sum / b;
			if (k == 0)
				k = m;
			if (k > m)
				k = m;

		}
		System.out.println("The worst middle grade is " + k);

	}
}