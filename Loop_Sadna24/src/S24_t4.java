import java.util.Scanner;
public class S24_t4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int persons, max_persons, age, age_average, max_age_average, temp;
        persons = 1;
        max_persons = 0;
        max_age_average = 0;
        while (persons>=0){
            System.out.println("Write amount of people in this apartment,please:");
            persons = input.nextInt();
            if(persons>=max_persons) max_persons=persons;                                                               //Searching maximal amount of people
            temp = persons;
            age_average = 0;
            System.out.println("Write ages of people in this apartment, please:");
            for (;persons>0;persons--){
                age = input.nextInt();
                age_average = age_average+age;
            }
            age_average = age_average/temp;
            if(age_average>max_age_average) max_age_average = age_average;
        }
        System.out.println("Maximal amount of people is: " + max_persons);
        System.out.println("Maximal average age of people is: " + max_age_average);

    }
}
