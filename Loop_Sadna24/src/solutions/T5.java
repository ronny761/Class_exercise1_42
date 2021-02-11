package solutions;

public class T5 {
    public static void main(String[] args) {
        System.out.println("Part Aleph\n\n");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

        System.out.println("\n\n\n\nPart Bet\n\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
