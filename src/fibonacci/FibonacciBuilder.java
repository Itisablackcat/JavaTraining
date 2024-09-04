package fibonacci;

public class FibonacciBuilder {
    //pole na długość
    private final int lenght;   //pole oznaczone final to znaczy, że wartosc musi byc ustawiona albo podczas deklarcji pola
    //albo podczas tworzenia obiektu klasy w konstruktorze, potem nie możemy zmieenić tej wartości
    //pole na tablicę
    private int[] fibonacciArray;

    //deklaracja sparametryzowanego konstruktora klasy, który na wejściu przyjmuje jakąś warość, którę zapiszemy
    public FibonacciBuilder(int lenght) {  //public, zeby z zewn mozna było wywołać
        this.lenght = lenght; //w obiekcie tej konkretnej klasy ustaw coś -- this
    }
   // public FibonacciBuilder build() {}

    //metoda, która zwraca/zasila tablicę wartościami
    public void setFibonacciArray() {
        this.fibonacciArray = new int[lenght];
        for (int i = 0; i < fibonacciArray.length; i++) {
            if (i==0 || i==1) {
                fibonacciArray[i] = i;
            }   else {
                fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
            }
        }
    }

    //metoda, która zwraca tablice
    public int[] getFibonacciArray() {
        //return to instrukcja do zwracania wartości, którą mozemy zapisać do zmiennej
        // lub przekazać jako /rgument
        return fibonacciArray;

    }

}
