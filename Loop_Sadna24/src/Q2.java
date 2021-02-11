import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int a=0, i=0, sum=0, t=0;
System.out.println("Enter a count of shops");
i=input.nextInt();
for(int c=0; c<i; c++) {
	for(int d=0; d<5; d++) {
		System.out.println("Enter the cost of pens");
		a=input.nextInt();
		sum=sum+a;}
	if (sum>t)
		t=sum;
	}
System.out.println("In the most expensive shop the cost of pen is"+t);

}

	




}

