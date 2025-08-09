package hexlet.code;

import hexlet.code.games.*;

public class App {
    public static void main(String[] args) {
        int choice = Games.choiceGame();
        switch (choice) {
            case 0: return;
            case 1:
                System.out.println("Welcome to the Brain Games!");
                String name = Cli.getUserName();
                System.out.println("Hello, " + name + "!");
                return;
            case 2: Even.play();
            return;
            case 3: Calc.play();
            return;
            case 4: Gcd.play();
            return;
            case 5: Progression.play();
            return;
            case 6: Prime.play();
            return;
            default:
                return;
        }
    }
}
