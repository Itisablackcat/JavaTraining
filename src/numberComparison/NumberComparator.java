package numberComparison;

public class NumberComparator {
    //Pola klasy - to zmienne w ramach całej klasy
    public int a;
    public int b;
//deklaracja metody porównującej dwie liczby korzystająca ze zmiennych zapisanych na poziomie pol klasy
    public  void compareTwoNumbers() {

        if (a > b) {
            System.out.println(a + " is greater than " + b);

        } else if (b > a) {
            System.out.println(b + " is greater than " + a);

        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

    public void printNumbers(){
        System.out.println("Liczba nr1: " + a);
        System.out.println("Liczba nr2: " + a);
        }


}
