package br.com.likwi.functionalProgramming.beyound;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Consumer;

public class Callback {
    public static void main(String[] args) {
        hello("Ale", "Montana", s -> {
            System.out.println("No lastname provied for ".concat(s));
        });
        hello("IA", null, s -> {
            System.out.println("No lastname provied for ".concat(s));
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println("name = " + firstName);
        if (StringUtils.isNotEmpty(lastName)) {
            System.out.println("lastName = " + lastName);
        } else {
            callback.accept(firstName);
        }
    }
}
