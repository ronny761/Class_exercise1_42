package solutions;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int GROUPS = 3;
        double min = 0;
        for (int i = 0; i < GROUPS; i++) {
            int grade = 0;
            int sum = 0;
            int count = 0;
            while (grade != -1) {
                grade = scanner.nextInt();
                if (grade != -1) {
                    sum += grade;
                    count++;
                }
            }
            double avg = ((double) sum) / count;
            if (avg < min || i == 0) {
                min = avg;
            }
            System.out.println();
        }

        System.out.println("The worst average is " + min);
    }
}
