package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }

    public static void main(String[] args) {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        final int menuExit = 0;
        final int menuGreet = 1;
        final int menuEven = 2;
        final int menuCalc = 3;
        final int menuGcd = 4;
        final int menuProgression = 5;
        final int menuPrime = 6;

        switch (choice) {
            case menuExit -> {
                return;
            }
            case menuGreet -> {
                System.out.println("Welcome to the Brain Games!");
                String name = Cli.getUserName();
                System.out.println("Hello, " + name + "!");
            }
            case menuEven -> Even.play();
            case menuCalc -> Calc.play();
            case menuGcd -> Gcd.play();
            case menuProgression -> Progression.play();
            case menuPrime -> Prime.play();
            default -> throw new RuntimeException("Unknown input: " + choice);
        }
    }
}
