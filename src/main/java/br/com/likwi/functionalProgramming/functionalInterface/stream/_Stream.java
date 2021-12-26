package br.com.likwi.functionalProgramming.functionalInterface.stream;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.function.Predicate;

import static br.com.likwi.functionalProgramming.functionalInterface.stream._Stream.Gender.FEMALE;


public class _Stream {

    static Faker faker = new Faker();
    static final Predicate<_Stream.Person> personPredicate = person -> FEMALE.equals(person.gender);

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

//        final Function<Person, String> personStringFunction = person -> person.name;
//        final ToIntFunction<String> stringToIntFunction = name -> name.length();
//        final IntConsumer println = System.out::println;
//        people.stream()
//                .map(personStringFunction)
//                .mapToInt(stringToIntFunction)
////                .collect(Collectors.toSet())
//                .forEach(println);

        final Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        final boolean containsOnlyFemales = people.stream()
                .allMatch(personPredicate);
        System.out.println("containsOnlyFemales = " + containsOnlyFemales);

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
