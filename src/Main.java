
public class Main {


    public static void main(String[] args) {

//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};

        char[][] telephone = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '8'},
                {'*', '0', '#'}};


        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }

}







