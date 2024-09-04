package fibonacci;

public class FibonacciPrinter {
    public static void printArray(int[] array, int counter){
        System.out.println("Drukuje tablice nr" + counter + " o długosci" + array.length);
        for (int element : array){
            //wypisywanie elemtów tablicy
            System.out.print(element + " ");
        }
        //przejście do nowej linii
        System.out.println();

    }
}
