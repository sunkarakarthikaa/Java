import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        String playerChoice;
        String computerChoice;

        System.out.println("ROCK PAPER SCISSORS GAME");

        System.out.print("Enter rock, paper, or scissors: ");
        playerChoice = scanner.nextLine().toLowerCase();

     
        computerChoice = choices[random.nextInt(3)];

        System.out.println("Computer chose: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        }

        else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        }

        else if (
                playerChoice.equals("rock") ||
                playerChoice.equals("paper") ||
                playerChoice.equals("scissors")
        ) {
            System.out.println("You lose!");
        }

        else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}