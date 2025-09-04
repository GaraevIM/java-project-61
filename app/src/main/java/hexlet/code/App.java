package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        int choice = Games.choiceGame();
        final int menuExit = 0;
        final int menuGreet = 1;
        final int menuEven = 2;
        final int menuCalc = 3;
        final int menuGcd = 4;
        final int menuProgression = 5;
        final int menuPrime = 6;
        switch (choice) {
            case menuExit: return;
            case menuGreet:
                System.out.println("Welcome to the Brain Games!");
                String name = Cli.getUserName();
                System.out.println("Hello, " + name + "!");
                return;
            case menuEven: Even.play();
                return;
            case menuCalc: Calc.play();
                return;
            case menuGcd: Gcd.play();
                return;
            case menuProgression: Progression.play();
                return;
            case menuPrime: Prime.play();
                return;
            default:
                return;
        }
    }
}
