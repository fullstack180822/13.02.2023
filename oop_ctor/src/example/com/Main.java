package example.com;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Person p = new Person("Moshe", "1010", 1.55f); // ctor -- constructor

        System.out.println(p);
        p.id = "1111";
        p.name = "Danny";
        p.setHeight(1.80f);

        System.out.println(p);

        Person unnkonwn_name = new Person("1234", 1.9f);



        Car c = new Car();

        // create configuration call it 'Run' and config it to run the Main class
        // create a ctor for car with all fields
        // create a car using this ctor
        // create a ctor which gets all fields except for price
        // in this ctor call the full ctor and give price of 50,000
        // create a ctor which gets all fields except for price and speed
        // in this ctor call the full ctor and give price of 50,000 + speed of 0
        // add setter getter using code snippet (Alt+Insert) for speed
        //      in the setter do NOT allow a negative speed
        // create 3 cars using the 3 ctors you created
        // create a toString (use code snippet -- modify to JSON format)
        // print the 3 cars
    }
}