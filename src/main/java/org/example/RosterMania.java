package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RosterMania {
    List<Person> roster = new ArrayList<>();
    public RosterMania(){
        Person benji = new Person("Benji", LocalDate.EPOCH, Person.Sex.MALE, "benji@benji.com", 2 );
        Person manny = new Person("Manny", LocalDate.EPOCH, Person.Sex.MALE, "manny@manny.com", 23 );
        Person jane = new Person("Jane", LocalDate.of(2000, 8, 9), Person.Sex.FEMALE, "jane@jane.com", 23 );
        Person doe = new Person("Doe", LocalDate.EPOCH, Person.Sex.FEMALE, "doe@doe.com", 48 );
        Person habibi = new Person("Habibi", LocalDate.EPOCH, Person.Sex.FEMALE, "habibi@habibi.com", 92 );
        Person brent = new Person("Brent", LocalDate.EPOCH, Person.Sex.MALE, "brent@brent.com", 33 );
        Person faiyaz = new Person("Faiyaz", LocalDate.EPOCH, Person.Sex.MALE, "faiyaz@faiyaz.com", 56 );
        Person travis = new Person("Travis", LocalDate.EPOCH, Person.Sex.MALE, "travis@travis.com", 43 );
        Person scott = new Person("Scott", LocalDate.EPOCH, Person.Sex.MALE, "scott@scott.com", 14 );
        Person kid = new Person("Kid", LocalDate.EPOCH, Person.Sex.FEMALE, "kid@kid.com", 9 );

        roster.add(benji);
        roster.add(manny);
        roster.add(jane);
        roster.add(doe);
        roster.add(habibi);
        roster.add(brent);
        roster.add(faiyaz);
        roster.add(travis);
        roster.add(scott);
        roster.add(kid);

    }
}
