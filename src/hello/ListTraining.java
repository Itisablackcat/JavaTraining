package hello;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTraining {
    //tworzymy pole (f1) - deklaracja
    private List<Integer> fibonacciList;

    public static void main(String[] args) {
        //lista z predefiniowaną długością
        //List<String> namesList = new ArrayList<>(5);
        List<String> namesList = new ArrayList<>();
        //dodanie elementu do listy
        namesList.add("John");
        namesList.add("Jane");
        namesList.add("Bob");
        //wypisanie elementów listy
        for (String name : namesList) {
            System.out.println(name);

        }
        System.out.println("--------------------");
        //dodanie do listy kilku elementów
        Collections.addAll(namesList, "Tomasz", "Agnieszka", "Iza");
        System.out.println(namesList);

        System.out.println("---------------------");
        //modyfikacja elementu listy

        namesList.set(0, "Jan");
        System.out.println(namesList.get(0));

        //przekazanie elementu gdzieś
        String firstName = namesList.get(0);

        //3 fib tworzymy obiekt klasy List Training -
        // musimy, bo metody setFibonacciList i printFibonacciListnie są statyczne
        ListTraining listTraining = new ListTraining();
        listTraining.setFibonacciList(Integer.parseInt(args[0]));
        listTraining.printFibonacciList();



    }
    //2 fib metoda tworząca listę z ciągiem fibonacciego
    private void setFibonacciList(int length) {
        //inicjalizacja listy
        fibonacciList = new ArrayList<>();
        //metoda
        for (int i = 0; i < length; i++) {
            if (i <2) {
                fibonacciList.add(i);
            } else{
                fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));
            }

        }
    }


    //2.1metoda drukująca listę
    private void printFibonacciList() {
        for (Integer element : fibonacciList) {
            System.out.print(element + " ");
        }
        System.out.println(); // wypisanie pustej linii
    }
}
