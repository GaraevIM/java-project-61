package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        int choice = Games.choiceGame();

        if (choice == 0) {
            return;
        }

        System.out.println("Welcome to the Brain Games!");
        Cli.getUserName();

        switch (choice) {
            case 1:
                break;
            case 2:
                Even.play();
                break;
            default:
        }
    }
}
