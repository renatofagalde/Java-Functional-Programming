package br.com.likwi.functionalProgramming.functionalInterface.optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class _Optional {
    public static void main(String[] args) {
        final  Supplier<Object> defaultValue = () -> "default value";


        final Object value = Optional.ofNullable(null)
                .orElseGet(defaultValue);
        System.out.println("value = " + value);

        System.out.println("-------------");

        Optional.ofNullable("abc@gmail.com")
                .ifPresent(email-> System.out.println("sending email to  " + email));

        System.out.println("-------------");
        Optional.ofNullable(null)
                .ifPresentOrElse(
                        (email-> System.out.println("sending email to  " + email)),
                        ()->{
                            System.out.println("Cannot send email");
                        });
    }
}
