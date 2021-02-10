import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		double people=0,age,maxpeople=0,maxsum=0,maxavg=0,avg=0;
		 Scanner input=new Scanner(System.in);
		
		while(people>=0) {
			double sum=0;
			System.out.println("how many people in the apartment ?");
			people=input.nextDouble();
			if(people>maxpeople)
				maxpeople=people;
			for(int i=0;i<people;i++)
			{
				System.out.println("enter the ages of the people ?");
				age=input.nextInt();
				sum=sum+age;
				avg=sum/people;
			}
			if(avg>maxavg)
				maxavg=avg;
			
		}
		System.out.println("the max people in apartment is "+maxpeople);
		System.out.println("the max avg of people in apartment is "+maxavg);
			
	}

}










