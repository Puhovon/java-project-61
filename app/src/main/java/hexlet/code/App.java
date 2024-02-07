package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calculate;
import hexlet.code.games.Even;
import hexlet.code.games.Node;

public class App {

    public static void main(String[] args) {
        final String greet = "1";
        final String even = "2";
        final String calculator = "3";
        final String gdc = "4";
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculate");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choise: ");
        Scanner console = new Scanner(System.in);

        switch (console.nextLine()) {
            case greet:
                Cli.getByName();
                break;
            case even:
                Even.even();
                break;
            case calculator:
                Calculate.calculate();
                break;
            case gdc:
                Node.node();
            default:
                break;
        }
    }
}
