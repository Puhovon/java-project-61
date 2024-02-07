package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Cli;
import hexlet.code.RandomNum;

public class Calculate {
    public static void calculate() {
        final String name = Cli.getByName();
        game(name);
    }

    private static void game(String name) {
        System.out.println("What is the result of the expression?");
        Scanner response = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int charIndex = (RandomNum.getRandomNum(2));
            int number1 = RandomNum.getRandomNum();
            int number2 = RandomNum.getRandomNum();

            if (charIndex == 1) {
                System.out.println("Question: " + number1 + " + " + number2);
                int answer =  Integer.parseInt(response.nextLine());
                if (number1 + number2 == answer) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }

            } else if(charIndex == 2) {
                System.out.println(number1 + " - " + number2 + "?");
                int answer =  Integer.parseInt(response.nextLine());
                if (number1 - number2 == answer) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            } else if(charIndex == 3) {
                System.out.println(number1 + " * " + number2 + "?");
                int answer =  Integer.parseInt(response.nextLine());
                if (number1 * number2 == answer) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + name + "!");

    }
}
