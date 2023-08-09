package org.example;

public class CheckPersonConcrete implements CheckPerson{
    //Specify via local class
    @Override
    public boolean test(Person p) {
        return (p.getGender() == Person.Sex.MALE && p.getAge() > 30);
    }
}
