import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1; // 1 to 100
        int guess;

        System.out.println("Guess a number between 1 and 100");

        do {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > number) {
                System.out.println("Too high!");
            }
            else if (guess < number) {
                System.out.println("Too low!");
            }
            else {
                System.out.println("Correct! You guessed the number.");
            }

        } while (guess != number);

        scanner.close();
    }
}