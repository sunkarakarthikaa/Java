import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] symbols = {"🍒", "🍋", "🔔", "⭐", "7️⃣"};

        double balance = 100;
        double bet;

        System.out.println("🎰 SLOT MACHINE 🎰");

        while (balance > 0) {

            System.out.println("Balance: $" + balance);

            System.out.print("Enter bet amount: $");
            bet = scanner.nextDouble();

            if (bet > balance || bet <= 0) {
                System.out.println("Invalid bet amount");
                continue;
            }

            String slot1 = symbols[random.nextInt(symbols.length)];
            String slot2 = symbols[random.nextInt(symbols.length)];
            String slot3 = symbols[random.nextInt(symbols.length)];

            System.out.println("-------------------");
            System.out.println(slot1 + " | " + slot2 + " | " + slot3);
            System.out.println("-------------------");

            if (slot1.equals(slot2) && slot2.equals(slot3)) {

                double winnings = bet * 5;
                balance += winnings;

                System.out.println("Jackpot! You won $" + winnings);
            }

            else if (
                    slot1.equals(slot2) ||
                    slot2.equals(slot3) ||
                    slot1.equals(slot3)
            ) {

                double winnings = bet * 2;
                balance += winnings;

                System.out.println("Nice! You won $" + winnings);
            }

            else {

                balance -= bet;

                System.out.println("You lost $" + bet);
            }

            System.out.print("Play again? (yes/no): ");
            scanner.nextLine();
            String choice = scanner.nextLine().toLowerCase();

            if (!choice.equals("yes")) {
                break;
            }
        }

        System.out.println("Final Balance: $" + balance);
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}