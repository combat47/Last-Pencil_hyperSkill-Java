package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many pencils would you like to use:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Who will be the first (John, Jack):");
        String first = scanner.next();
        for (int i = 0; i < num;i++){
            System.out.print("|");
        }
        System.out.println();
        System.out.println(first + " is going first!");
    }
}
