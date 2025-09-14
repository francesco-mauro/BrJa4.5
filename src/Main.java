import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int numOfDice;
        int total;

        System.out.println("enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            System.out.println("you roll the dice");

        }
        else {
            System.out.println("number of dice must be greater than 0");
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


}







