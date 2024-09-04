package hello;
//sygnatura klasy
public class HelloWorld {
    //deklaracja metody main
    public static void main(String[] args) {
        //wypisanie tekstu na ekranie
        System.out.println("Hello World");

        //deklaracja zmiennej
        String name;
        //inicjalizacja zmiennej - przypisanie wartości
        name = "Iza";
        //deklaracja z inicjalizacją
        String surname = "Grempka";

        //wypisanie na ekranie statycznego tekstu z odwolaniem się do zmiennej
        System.out.println("Cześć, nazywam się " + name + " " + surname);
        //wypisanie na ekranie  tekstu z atrybutami przekazanymi podczas uruchomienia main

        System.out.println("UZytkownik programu nazywa się " + args[0] + " " + args[1]);

        //



    }
}
