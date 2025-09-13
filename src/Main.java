public class Main {
    public static void main(String[] args) {

        String name = "Bro";
        int age = 25;


        double result = cube(3);
        System.out.println(result);

        String fullName= getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);

    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday to %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!\n");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

}




