import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        int numOfFruits = fruits.length;

        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }



        System.out.println(fruits[0]);
        System.out.println(numOfFruits);


    }


}







