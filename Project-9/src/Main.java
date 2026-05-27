import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println("********************");
            System.out.println("BANKING PROGRAM");
            System.out.println("********************");
            System.out.println("1 - Show Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");
            System.out.println("********************");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1 -> showBalance(balance);

                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    balance += deposit(amount);
                }

                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    balance -= withdraw(amount, balance);
                }

                case 4 -> {
                    isRunning = false;
                    System.out.println("Thank you! Goodbye.");
                }

                default -> System.out.println("Invalid choice");
            }
        }

        sc.close();
    }

    // Show Balance
    static void showBalance(double balance) {
        System.out.printf("Your balance is: $%.2f\n", balance);
    }

    // Deposit
    static double deposit(double amount) {

        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        }

        return amount;
    }

    // Withdraw
    static double withdraw(double amount, double balance) {

        if (amount > balance) {
            System.out.println("Insufficient balance");
            return 0;
        }

        else if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        }

        return amount;
    }
}