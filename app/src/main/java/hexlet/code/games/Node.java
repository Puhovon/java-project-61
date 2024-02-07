package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.RandomNum;

import java.util.Scanner;

public class Node {

    public static void node() {
        final String name = Cli.getByName();
        game(name);
    }

    private static void game(String name) {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner response = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            int firstNum = RandomNum.getRandomNum();
            int secondNum = RandomNum.getRandomNum();
            System.out.println("Question: " + firstNum + " " + secondNum);
            int currentResult = searchNod(firstNum, secondNum);
            if(Integer.parseInt(response.nextLine()) == currentResult){
                System.out.println("Correct!");
            }
            else {
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static int searchNod(int a, int b) {
        int currentNod = 0;
        for(int i = 1; i < Math.max(a, b); i++) {
            if(a % i == 0 && b % i == 0) {
                currentNod = i;
            }
        }
        return currentNod;
    }
}
