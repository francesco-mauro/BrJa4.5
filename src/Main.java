import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int numOfDice;
        int total = 0;

        System.out.println("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {

            for (int i = 1; i < numOfDice + 1; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println(i + ") You rolled: " + roll);
                total += roll;


            }
            System.out.println( "+++++++++++++++++++\n");
            System.out.println( "Your total is: " + total);

        } else {
            System.out.println("Number of dice must be greater than 0");
        }
        /*
         * declare variables
         * get # of dice forom the user
         * check if # of dice is >0
         * roll all the dice
         * get the total
         * display the ascii of dice
         * */

        scanner.close();

    }

    static void printDie(int roll) {

        String dice1 = """
                  -------
                 |       |
                 |   1   |
                 |       |
                  -------
                """;
        String dice2 = """
                  -------
                 |       |
                 |   2   |
                 |       |
                  -------
                """;
        String dice3 = """
                  -------
                 |       |
                 |   3   |
                 |       |
                  -------
                """;
        String dice4 = """
                  -------
                 |       |
                 |   4   |
                 |       |
                  -------
                """;
        String dice5 = """
                  -------
                 |       |
                 |   5   |
                 |       |
                  -------
                """;
        String dice6 = """
                  -------
                 |       |
                 |   6   |
                 |       |
                  -------
                """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }


    }


}







