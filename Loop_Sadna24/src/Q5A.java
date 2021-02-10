import java.util.Scanner;

public class Q5A {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
int count=input.nextInt();
for(int i=count;i>0;i--) {
	 System.out.print(i);
	 for(int j=i;j>0;j--) {
		 System.out.print("X");
	 }
	 
}
	}

}
