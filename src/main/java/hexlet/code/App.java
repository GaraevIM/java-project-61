package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        int choice = Games.choiceGame();

        switch (choice) {
            case 0:
                return;
            case 1:
                System.out.println("Welcome to the Brain Games!");
                String name = Cli.getUserName();
                System.out.println("Hello, " + name + "!");
                return;
            case 2:
                Even.play();
                return;
            case 3:
                Calc.play();
                return;
            default:
        }
    }
}
