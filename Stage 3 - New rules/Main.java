package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pencils would you like to use:");
        int pencils = Integer.parseInt(scanner.nextLine());

        System.out.println("Who will be the first (John, Jack):");
        String first = scanner.nextLine();

        System.out.println("|".repeat(pencils) + "\n"
                + first + " is going first!");
    }
}
