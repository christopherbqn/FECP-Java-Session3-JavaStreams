package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class JavaStreams {

    public static void FilterOddNumbers(){
        // activity 1: Filter Odd Numbers
        System.out.println("Activity 1: Filter Odd Numbers");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isOdd = n -> n%2 != 0;
        List<Integer> oddNums = numbers.stream().filter(isOdd).toList();

        System.out.println("Original Numbers: " + numbers);
        System.out.println("Odd Numbers: " + oddNums);
    }

    public static void FilterSartsWithA(){
        // activity 2: Filter Strings Starting with 'A'
        System.out.println("\nActivity 2: Filtering Strings Starting with 'A'");
        List <String> names = Arrays.asList("Alice", "Adam", "Bob", "Angela", "Brian");

        Predicate<String> startsWithA = s -> s.startsWith("A");
        List <String> namesStartsWithA = names.stream().filter(startsWithA).toList();

        System.out.println("Original Names: " + names);
        System.out.println("Names that start with 'A': " + namesStartsWithA);

    }


    public static void SquareAllNumbers(){
        // activity 3:Square All Numbers
        System.out.println("\nActivity 3: Square All Numbers");
        List <Integer> numsOneToFive = Arrays.asList(1, 2, 3, 4, 5);

        List <Integer> numsSquare = numsOneToFive.stream().map(n-> n*n).toList();

        System.out.println("Original Numbers: " + numsOneToFive);
        System.out.println("Squared Numbers: " + numsSquare);
    }

    public static void FilterCombined(){
        // activity 4: Combine Predicates
        System.out.println("\nActivity 4: Combine Predicates");
        List <Integer> numsOneToTen = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate <Integer> isEven = n-> n%2 == 0;
        Predicate <Integer> greaterThanFive = n -> n > 5;

        List <Integer> filteredNums = numsOneToTen.stream().filter(isEven.and(greaterThanFive)).toList();
        System.out.println("Original Numbers: " + numsOneToTen);
        System.out.println("Filtered Numbers (Even + Greater than 5): " + filteredNums);
    }

}
