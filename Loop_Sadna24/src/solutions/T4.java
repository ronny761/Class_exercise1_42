package solutions;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPeople = 0;
        double maxAvg = 0;
        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();
        while (people > 0) {
            int sum = 0;
            for (int i = 0; i < people; i++) {
                System.out.print("Enter age of the person #" + (i+1));
                int age = scanner.nextInt();
                sum += age;
            }

            double avg = ((double) sum) / people;

            if (avg > maxAvg) {
                maxAvg = avg;
            }
            if (people > maxPeople) {
                maxPeople = people;
            }

            people = scanner.nextInt();
        }

        System.out.println("The largest number of people is " + maxPeople);
        System.out.println("The biggest age average is " + maxAvg);
    }
}
