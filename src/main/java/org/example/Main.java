package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main implements CheckPerson{
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//String name, LocalDate birthday, Person.Sex gender, String emailAddress, Integer age

    public static void main(String[] args) {
        RosterMania rosterMania = new RosterMania();
        CheckPersonConcrete tester = new CheckPersonConcrete();

        printPersons(rosterMania, tester);
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    @Override
    public boolean test(Person p) {
        return false;
    }
}