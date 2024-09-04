package hello;

public class ifTraining {
    public static void main(String[] args) {
        compareTwoNumbers(2, 5);    //musi być wywołanie poniższej metody
        compareTwoNumbers(7, 5);
        compareTwoNumbers(2, 2);

        try {
            compareTwoNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        } catch (NumberFormatException e) {
            System.out.println("Musisz podać liczby");
            throw e;  //rzuć wyjątek i zakończ działanie
        }
        System.out.println("Coś po wyjątku");
    }

    public static void compareTwoNumbers(int a, int b) {

        if (a > b) {

            System.out.println(a + " is greater than " + b);

        } else if (b > a) {

            System.out.println(b + " is greater than " + a);

        } else {

            System.out.println(a + " is equal to " + b);

        }

    }
}