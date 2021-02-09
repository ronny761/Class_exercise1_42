import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max_TenantsInApartment = 0;
		int average = 0, max_Average_TenantsInApartment = 0;
		int ages = 0, totalAgesInOneApartment = 0;
		int tenants = 1;
		while (tenants > 0) {
			System.out.println("enter the number of people");
			tenants = input.nextInt();
			for (int i = 0; i < tenants; i = i + 1) {
				System.out.println("enter the ages of the people who live in the apartment");
				ages = input.nextInt();
				totalAgesInOneApartment = ages + totalAgesInOneApartment;

			} // for
			average = totalAgesInOneApartment / tenants;
			if (max_TenantsInApartment < tenants)
				max_TenantsInApartment = tenants;
			if (max_Average_TenantsInApartment < tenants)
				max_Average_TenantsInApartment = average;

		} // while
		System.out.println("max tenants in apartment " + max_TenantsInApartment);
		System.out.println("max average tenants in apartment " + max_Average_TenantsInApartment);

	}

}
