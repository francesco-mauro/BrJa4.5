import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 3; i++){
//
//            for (int j = 1; j <= 9; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//
//        }

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.println("Enter the numbers of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the numbers of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < columns; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();

    }
}

