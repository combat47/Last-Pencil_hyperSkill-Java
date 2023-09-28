package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pencils would you like to use:");
        int pencils = sc.nextInt();
        System.out.println("Who will be the first (John, Jack):");
        String name = sc.next();
        while (pencils > 0) {
            System.out.println("|".repeat(pencils) + "\n" + name + "'s turn!");
            pencils -= sc.nextInt();
            name = name.equals("John") ? "Jack" : "John";
        }
    }
}
