import java.util.Scanner;
public class S24_t5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Write a number, please");
        a = input.nextInt();
        System.out.println("Part alef:");
        for(int i = 1 ;i<=a;i++){
            System.out.print(i);
            for(int t=i;t>=1;t--) System.out.print("X");
            System.out.print("\n");
        }
        System.out.println("\n Part bet:");
        for(b = 1 ;b<=a;b++){
            for(int t=1;t<=b;t++) System.out.print(t);
            System.out.print("\n");
        }
    }
}
