package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getByName() {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        System.out.println("Hello, " + sc.nextLine() + "!");
    }
}
