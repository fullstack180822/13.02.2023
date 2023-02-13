package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    static Random r = new Random();

    public static float getSumHeights(Person p1, Person p2)
    {
        return p1.getHeight() + p2.getHeight();
    }

    public static Person createRandomPerson(String name)
    {
        String id = String.format("%d", r.nextInt(100000));
        float height = r.nextFloat() * 2;
        Person new_person = new Person(name, id, height);

        return new_person;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Person p1 = new Person("jenny", "14689", 1.8f);

        Person p2 = new Person("bob", "8971", 1.9f);

        System.out.println(getSumHeights(p1, p2));

        Person rand_person = createRandomPerson("Shai");

        System.out.println(rand_person);

        int[] numbers =   { 1,                                                 2,                                               3};
        Person[] people = {new Person("jenny", "14689", 1.8f), new Person("bob", "8971", 1.9f), p1};

        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        System.out.println(Arrays.toString(nums));

        System.out.println("Team:");
        Person[] team = new Person[3];
        team[0] = new Person("jenny", "14689", 1.8f);
        team[1] = new Person("bob", "8971", 1.9f);
        team[2] = p1;
        System.out.println(Arrays.toString(team));

        // list
        ArrayList<Integer> int_flex = new ArrayList<Integer>();
        //int_flex[0] = 3;
        int_flex.add(3);
        int_flex.add(10);
        int_flex.add(20);
        int_flex.add(2, 15);
        //int_flex.add(10, 15);
        System.out.println(int_flex);
        System.out.println(int_flex.get(1));
        int_flex.remove(3);
        System.out.println(int_flex);

        ArrayList<Person> people_flex = new ArrayList<Person>();
        people_flex.add(team[0]);
        people_flex.add(new Person("bob", "8971", 1.9f));
        people_flex.add(p1);
        people_flex.add(p1);
        System.out.println(people_flex);
        people_flex.remove(p1);
        System.out.println(people_flex);

        for (Person one_person: people_flex) {
            System.out.println(one_person.name);
        }

        // targil
        // create class car -- or bring it from the previous exercise
        // create a function that gets 2 cars as a parameter and returns the sum price of them
        // create a function that gets 2 cars as a parameter and returns the car which is higher speed
        // create a function which gets a car model, brand -- then creates a new car with a random price and speed and returns it
        // create an arrays of cars and put three cars in the array + print the array
        // create a list of cars and put 3 cars in these list
        // then add a new car between car-2 and car-3 in the list
        // remove 1 car from the list
        // print the list
        // run with foreach loop on the list of cars and print the price
    }
}