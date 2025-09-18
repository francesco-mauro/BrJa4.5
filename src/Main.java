
public class Main {


    public static void main(String[] args) {

        System.out.println(average(1, 2, 3, 4));

    }

//    static int add(int... numbers) {
//        int sum = 0;
//
//        for (int number : numbers) {
//            sum += number;
//        }
//        return sum;
//
//    }

    static double average(double... numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;

    }

}







