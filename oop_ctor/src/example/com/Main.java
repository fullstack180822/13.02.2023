package example.com;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Person p = new Person("Danny", "1111", 1.8f); // ctor -- constructor

        p.id = "1111";
        p.name = "Danny";
        p.setHeight(1.80f);

        Person unnkonwn_name = new Person("1234", 1.9f);

        Car c = new Car();

    }
}