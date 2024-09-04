package company;

import company.classes.Employee;
import company.classes.Manager;
import company.classes.Person;

public class CompanyProgram {
//    public static void main(String[] args) {
//        System.out.println("Ponizej sa tworzone 2 obiekty klasy Person - pierwszy został utworzony jako pusty i uzupelniony wartosciami, drugi jest uzupelniony wartosciami w momecie tworzenia obiektu");
//        //chce skorzystac z pol z emptyPerson, tworze pusty obioekt klasy Person
//        Person emptyPerson = new Person(); //po utworzeniu wlasnego konstr bedzie blad
//        //chce ustawic wartosc w polach obiektu poprzez wywołanie metod setujących (pola są protected, dlatego nie możemy s
//        // ię odwołac bezposrednio
//        //emptyPerson.firstName = "Jan";   //nie  moge sie odwolac, bo to inny pakiet, robimy więc:
//        emptyPerson.setFirstName("Jan");
//        emptyPerson.setLastName("Smith");
//        emptyPerson.setAge(22);
//        //ograniczmy ilosc kodu, aby dane były już na etapie tworzenia obiektu
//        //tworze własny konstruktor --> drugie podejscie, wymuszajace stworzenie konstrukora w person
//
//        //wywołanie metody say hello, która wypisuje dane konkretnej osoby
//        emptyPerson.sayHello();
//
//
//        //tworzymy uzupełniony obiekt bez seterow - drugie podejscie
//        Person completePerson = new Person("Marcin", "Nowak", "24");
//        completePerson.sayHello();
//    }



    public static void main(String[] args) {
        System.out.println("Poniżej są tworzone 2 obiekty klasy Person - pierwszy został utworzony jako pusty i uzupełniony wartościami, drugi jest uzupełniony w momencie tworzenia obiektu.");
        //Utworzenie pustego obiektu klasy Person
        Person emptyPerson = new Person();
        //Ustawienie wartości w polach obiektu poprzez wywołanie metod setujących (pola są protected, dlatego nie możemy się do nich odwołać w bezpośredni sposób)
        emptyPerson.setFirstName("Jan");
        emptyPerson.setLastName("Kowalski");
        emptyPerson.setAge(30);
        //Wywołanie metody sayHello, która wypisuje dane dotyczące konkretnej osoby
        emptyPerson.sayHello();

        Person completePerson = new Person("Marcin", "Nowak", 24);
        completePerson.sayHello();
        System.out.println("---------------------");

        //utworzenie obiektu rprezentujacego pracownika
        Employee employeeAnna = new Employee("Anna", "Kowalska", 26, 5000);
        //przywitanie sie pracownika przed przydzialem managera
        employeeAnna.sayHello();

        //utworzenie obiektu managera
        Manager managerRenata = new Manager("Renata", "Nowak", 32, 7000, "QA" );
        managerRenata.sayHello();

        //przypisanie do pracownika
        employeeAnna.setManager(managerRenata);
        employeeAnna.sayHello();
        managerRenata.sayHello();


    }
}
