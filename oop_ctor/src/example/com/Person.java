package example.com;

public class Person {


    public String name;
    public String id;
    private float height = 5.5f;

    //public Person() {
        //this.height = 5.5f;
    //}

//    public Person(String name, String id, float height) {
//        this.name = name;
//        this.id = id;
//        this.setHeight(height);
//    }
//

    public Person(String id, float height) {
        this("Incognio", id, height); // Person(String name, String id, float height)

        //this.name = "Incognio";

        // code duplication -- bad
        // this.name = "Incognio";
        // this.id = id;
        // this.height = height;
    }

    public Person(String name, String id, float height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    public void babyBorn()
    {
        this.height = 0.8f;
        this.setHeight(0.8f);
    }

    public float getHeight()
    {
        // check if israel --> Meter + Cm
        // if USA --> Feet
        return this.height;
    }

    public void setHeight(float value)
    {
        // print to log
        if (value >= 0.8)
        {
            this.height = value;
        }
        else
        {
            // just an option
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Person {" +
                "name: '" + name + '\'' +
                ", id: '" + id + '\'' +
                ", height: " + height +
                '}';
    }
}
