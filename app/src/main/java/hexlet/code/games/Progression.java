package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.RandomNum;

import java.util.Scanner;

public class Progression {
    public static void progression() {
        String name = Cli.getByName();
        game(name);
    }

    public static void game(String name) {
        System.out.println("What number is missing in the progression?");
        Scanner response = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int progress = RandomNum.getRandomNum(10);
            int startProgression = RandomNum.getRandomNum(20);
            generateProgressionString(progress, startProgression);
            System.out.println(generateProgressionString(progress, startProgression));
            var answer = parseIntOrNull(response.nextLine());
            if(answer == null) {
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            if (answer == progress) {
                System.out.println("Correct!");
            } else {
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static Integer parseIntOrNull(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static String generateProgressionString(int progression, int start) {
        int censored = RandomNum.getRandomNum(9);
        StringBuilder string = new StringBuilder("Question: ");
        for (int j = 0; j < 10; j++) {
            if(censored == j) string.append("..");
            else string.append(start);
            string.append(" ");
            start += progression;
        }
        return string.toString();
    }
}
