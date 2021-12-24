package br.com.likwi.functionalProgramming.imperative;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

import static br.com.likwi.functionalProgramming.imperative.Main.Gender.FEMALE;

public class Main {

    static Faker faker = new Faker();

    public static void main(String[] args) {
        final List<Person> people = List.of(Person.builder()
                        .name("Ale")
                        .gender(FEMALE)
                        .build(),
                Person.builder()
                        .name("Roberta")
                        .gender(FEMALE)
                        .build(),
                Person.builder()
                        .name("Senna")
                        .gender(Gender.MALE)
                        .build(),
                Person.builder()
                        .name("Neo")
                        .gender(Gender.MALE)
                        .build());

        //imeprative
        List<Person> females = new ArrayList<Person>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person f : females) {
            System.out.println(f);
        }

        System.out.println("###########");

        //declarative approach
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
//                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    @Data
    @AllArgsConstructor
    @Builder
    @ToString
    static class Person {

        private final String name;
        private final Gender gender;
    }

    enum Gender {
        MALE, FEMALE
    }
}
