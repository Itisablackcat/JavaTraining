package hello;

public class ArrayTraining {
    public static void main(String[] args) {
        //deklaracja tablicy
        int[] arr = new int[10];
        //zasilenie tablicy danymi
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;  //bo chcemy mieś wartości od 1 do 10
        }
        //wypisanie elementów tablicy
        for (int element: arr){
            System.out.println(element);
        }

    }
}
