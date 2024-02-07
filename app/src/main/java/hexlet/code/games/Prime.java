package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.RandomNum;

import java.util.Scanner;

public class Prime {
    public static void prime() {
        String name = Cli.getByName();
        game(name);
    }

    private static void game(String name) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner response = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int number = RandomNum.getRandomNum();
            boolean isPrime = checkIsPrime(number);
            System.out.println("Question: " + number);
            String answer = response.nextLine();
            System.out.println(number + " " + isPrime);
            if ((answer.equalsIgnoreCase("yes") && isPrime)
                    || (answer.equalsIgnoreCase("no") && !isPrime)) {
                System.out.println("Correct");
            } else {
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private static boolean checkIsPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
