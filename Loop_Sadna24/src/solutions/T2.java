package solutions;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter shops count: ");
        int shops = scanner.nextInt();
        int max = 0;
        for (int i = 1; i <= shops; i++) {
            int sum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Enter cost of the pen #" + j + ": ");
                int cost = scanner.nextInt();
                sum += cost;
            }
            if (sum > max) {
                max = sum;
            }
            System.out.println("In the shop #" + i + " the pens cost " + sum);
        }

        System.out.println("In the most expensive shop the pens cost " + max + "₪");
    }
}
