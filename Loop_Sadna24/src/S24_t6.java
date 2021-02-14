import java.util.Scanner;
public class S24_t6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Write a number, please");
        a = input.nextInt();
        System.out.println("Part alef:");
        for(int i = a ;i>=1;i--){
            System.out.print(i);
            for(int t=i;t>=1;t--) System.out.print("X");
            System.out.print("\n");
        }
        System.out.println("\nPart bet:");
        for(b = 2 ;b<=a;b++){
            for(int t=b;t>=1;t--) System.out.print(t);
            System.out.print("\n");
        }
    }
}