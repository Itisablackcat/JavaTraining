package company.classes;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;     //age to typ prosty int, bo nie będziemy tam mieć nulla
    //tworze wlasny konstruktor - drugie podejsci

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Domyślny konstruktor klasy, jeżeli utworzyliśmy konstruktor sparametryzowany, to musimy go jawnie zaimplementować, żeby móc tworzyć pusty obiekt klasy
    //przywraca mozliwosc tworzenie pustego obiektu
    public Person(){}

    // metoda określa, jak mozemy skorzystać z tego pola - pierwsze podejscie
    public void setFirstName(String firstName) { //umożliwia skorzystanie z first name
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //metoda do przywitania się
    public void sayHello() {
        System.out.println("Cześć, nazywam się " + firstName + " " + lastName + ", mam " + age + " lat.");
    }

    //pobranie imienia
    public String getFirstName() {
        return firstName;
    }
}
