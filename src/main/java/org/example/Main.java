package org.example;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String [] args){

        // activity 1: Filter Odd Numbers
        JavaStreams.FilterOddNumbers();

        // activity 2: Filter Strings Starting with 'A'
        JavaStreams.FilterSartsWithA();

        // activity 3:Square All Numbers
        JavaStreams.SquareAllNumbers();

        // activity 4: Combine Predicates
        JavaStreams.FilterCombined();


        // activity 5: Sort Objects Using Comparator
        System.out.println("\nActivity 5: Sort Objects Using Comparator");
        List <Person> people = Arrays.asList(
                new Person("Jerome", 23),
                new Person("Scott", 25),
                new Person("Chris", 21),
                new Person("Nadie", 22),
                new Person("Calvin", 23)
        );

        Comparator<Person> byAge = (p1,p2) -> p1.getAge() - p2.getAge();
        Comparator<Person> byNameAsc = (p1, p2) -> p1.getName().compareTo(p2.getName());

        System.out.println("\nPeople sorted by Age - Ascending:");
        List<Person> peopleSortedByAgeAsc = people.stream().sorted(byAge).toList();
        peopleSortedByAgeAsc.forEach(System.out::println);

        System.out.println("\nPeople sorted by Name - Ascending:");
        List<Person> peopleSortedByNameAsc = people.stream().sorted(byNameAsc).toList();
        peopleSortedByNameAsc.forEach(System.out::println);

        System.out.println("\nPeople sorted By Age - Descending:");
        List<Person> peopleSortedByAgeDesc = people.stream().sorted(byAge).toList().reversed();
        peopleSortedByAgeDesc.forEach(System.out::println);

    }

}