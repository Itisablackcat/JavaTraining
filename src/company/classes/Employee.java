package company.classes;

public class Employee extends Person {
    //pola
    protected int salary;
    private Manager manager;

    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age); //super oznacza ze wywolujemy konstruktor z klasy nadrzednej, nie tworzy sie jeszcze obiekt
        this.salary = salary; //z biezacej klasy
    }

    //przydzielenie managera
    public void setManager(Manager manager) {
        this.manager = manager;
        manager.assignEmployee(this);//this odwoluje sie z poziomu istniejacego obiektu klasy employee
    }

    //metoda powitalna
    public void sayHello() {
        if (manager == null) {
            System.out.println("Cześć, nazywam się " + firstName + " " + lastName +
                    ", mam " +age + " lat, zarabiam " + salary + "zł, " +
                    "czekam na przydział do jakiegoś działu w firmie.");
        } else {
            System.out.println("Cześć, nazywam się " + firstName + " " + lastName +
                    ", mam " +age + " lat, zarabiam " + salary + "zł, " +
                    "pracuję w dziale " + manager.getDepartment());
        }
    }


}
