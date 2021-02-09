import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int grade = 0, totalGrades = 0, kids = 0;
		double average = 0, minAverage = 10000000;
		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("group number " + (i + 1));
			grade = 0;
			kids = 0;
			average = 0;
			totalGrades = 0;
			System.out.println("enter the grades");
			grade = input.nextInt();
			for (; grade != -1;) {

				kids = kids + 1;
				totalGrades = totalGrades + grade;
				System.out.println("enter the grades");
				grade = input.nextInt();

			} // for
			average = totalGrades / kids;
			if (minAverage > average)
				minAverage = average;
		} // for

		System.out.println("minimum average " + minAverage);

	} // main

}
