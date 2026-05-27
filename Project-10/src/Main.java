import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberOfDice;
        int total = 0;

    
        System.out.print("Enter number of dice to roll: ");
        numberOfDice = scanner.nextInt();

     
        if (numberOfDice > 0) {

      
            for (int i = 1; i <= numberOfDice; i++) {

                int roll = random.nextInt(6) + 1;

                System.out.println("Die " + i + ": " + roll);

              
                total += roll;

               
                switch (roll) {

                    case 1 ->
                        System.out.println("""
                             -------
                            |       |
                            |   *   |
                            |       |
                             -------
                            """);

                    case 2 ->
                        System.out.println("""
                             -------
                            | *     |
                            |       |
                            |     * |
                             -------
                            """);

                    case 3 ->
                        System.out.println("""
                             -------
                            | *     |
                            |   *   |
                            |     * |
                             -------
                            """);

                    case 4 ->
                        System.out.println("""
                             -------
                            | *   * |
                            |       |
                            | *   * |
                             -------
                            """);

                    case 5 ->
                        System.out.println("""
                             -------
                            | *   * |
                            |   *   |
                            | *   * |
                             -------
                            """);

                    case 6 ->
                        System.out.println("""
                             -------
                            | *   * |
                            | *   * |
                            | *   * |
                             -------
                            """);
                }
            }

            System.out.println("Total = " + total);
        }

        else {
            System.out.println("Number of dice must be greater than 0");
        }

        scanner.close();
    }
}