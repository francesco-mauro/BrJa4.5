import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What number of foods o you want? ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];


        for (int i = 0; i < foods.length; i++) {
            System.out.println("enter a food: ");
            foods[i] = scanner.nextLine();

        }

        System.out.println("------------------------");

        for (String food : foods) {
            System.out.println(food);
        }

//        System.out.println(foods.length);

        scanner.close();


    }


}







