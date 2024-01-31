package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.*;

public class Even {
    public static void even() {
        final String name = Cli.getByName();
        game(name);
    }

    private static void game(String name) {
        Scanner response = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int range = 100;

        for(int i = 0; i < 3; i++) {
            int number = RandomNum.getRandomNum();
            System.out.println(number);
            if(((number % 2 == 0) && (response.nextLine().equals("yes")))
                    || (number % 2 != 0) && (response.nextLine().equals("no"))) {
                System.out.println("Correct!");
            } else {
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

