package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main{

//https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
    //https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#syntax
    public static void main(String[] args) {
        RosterMania rosterMania = new RosterMania();
        CheckPersonConcrete tester = new CheckPersonConcrete();

        //local class
        //printPersons(rosterMania, tester);

//        anonymous class
//        printPersons(rosterMania, new CheckPerson() {
//                    public boolean test(Person p) {
//                        return p.getGender() == Person.Sex.FEMALE && p.getAge() >= 0 && p.getAge() <= 92;
//                    }
//                }
//        );


        //lambdas

        //https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#syntax
        //lambdas are classless methods that when you pass in the params you instantiate it and what you do to those objects is after the arrow
        //review how these relate to streams
        //The syntax for a lambda expression is (parameters) -> expression or block of statements. Lambdas consist of three parts:
        //
        //Parameters: The input parameters of the method.
        //Arrow (->): Separates the parameters from the body of the lambda.
        //Body: The implementation of the method.


        //printPersons(rosterMania, (Person p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 23);
        //printPersonsWithPredicate(rosterMania, p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 0 && p.getAge() <= 100);

        //rosterMania.forEach(rosterMania.get(1) -> System.out.println("Hello") );


        //stream goes src(data -> intermediate operation -> terminal operation eg.toList
        List<Person> test = new ArrayList<>();
        //this iteration collect the data that meets the lambda expression and collects it into anothe collection
        test = rosterMania.stream().filter(p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 0 && p.getAge() <= 100).collect(Collectors.toList());
//        for (Person element: test) {
//            System.out.println(element);
//        }
        //test.forEach(person -> System.out.println(person));
        //test.forEach(System.out::println);

//        rosterMania.stream().filter(p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 0 && p.getAge() <= 100)
//                .forEach(person -> System.out.println(person));

        //  //stream goes src(data -> intermediate operation -> terminal operation eg.toList or printing it out
        rosterMania.stream().filter(p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 0 && p.getAge() <= 100)
                .forEach(System.out::println);




//  The CheckPerson interface is a functional interface. A functional interface is any interface that contains only one abstract method.
//  (A functional interface may contain one or more default methods or static methods.)
//  Because a functional interface contains only one abstract method, you can omit the name of that method when you implement it.
//  To do this, instead of using an anonymous class expression, you use a lambda expression
    }

    //THE FUNCTIONAL INTERFACE IS BEING USED HERE AND this method just passes goes through the roster and checks each person test
    //try and use this with streams mayb so we dont need the method?
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}