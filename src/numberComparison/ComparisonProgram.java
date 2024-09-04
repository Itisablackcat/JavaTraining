package numberComparison;

public class ComparisonProgram {
    public static void main(String[] args) {

        System.out.println("------Pierwszy obiekt---------");
        //musimy stworzyc pusty obiekt/typ klasy (pusty - pola bez wartości) używając domyślnego konstrulktora klasy
        NumberComparator numberComparator = new NumberComparator();
        //
        //odwołujemy się do niego po nazwie
        numberComparator.a = 4;
        numberComparator.b = 2;
        numberComparator.printNumbers();
        numberComparator.compareTwoNumbers();

        System.out.println("------Drugi obiekt---------");
        //tworzymy nowy obiekt
        NumberComparator numberComparator2 = new NumberComparator();
        numberComparator2.a = 9;
        numberComparator2.b = 21;
        numberComparator2.printNumbers();
        numberComparator2.compareTwoNumbers();

        System.out.println("------Znowu pierwszy obiekt---------");
        numberComparator.printNumbers();
        numberComparator.compareTwoNumbers();


    }
}
