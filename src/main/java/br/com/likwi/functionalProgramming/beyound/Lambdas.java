package br.com.likwi.functionalProgramming.beyound;

import java.time.LocalDate;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        System.out.println("upperName.apply(\"all in upper!\") = " + upperName.apply("all in upper!"));
        System.out.println("------------");
        System.out.println(upperCase.apply("ale", LocalDate.EPOCH.getYear()));
    }

    private static Function<String, String> upperName = String::toUpperCase;
    private static BiFunction<String, Integer, String> upperCase = (name, age) -> {
        if (name.isBlank()) throw new IllegalArgumentException("");
        System.out.println("age = " + age);
        return name.toUpperCase().concat("\t age ->\t").concat(age.toString());
    };
}
