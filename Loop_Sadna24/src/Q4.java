import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		  int maxPeople = 0;
	        double maxAvg = 0;
	        System.out.print("Enter number of people: ");
	        int people = input.nextInt();
	        while (people > 0) {
	            int sum = 0;
	            for (int i = 0; i < people; i++) {
	                System.out.print("Enter age of the person #" + (i+1));
	                int age = input.nextInt();
	                sum += age;
	            }

	            double avg = ((double) sum) / people;

	            if (avg > maxAvg) {
	                maxAvg = avg;
	            }
	            if (people > maxPeople) {
	                maxPeople = people;
	            }

	            people = input.nextInt();
	        }

	        System.out.println("The largest number of people is " + maxPeople);
	        System.out.println("The biggest age average is " + maxAvg);
	}

}
