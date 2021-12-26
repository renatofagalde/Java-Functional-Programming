package br.com.likwi.functionalProgramming.functionalInterface.combinatorPattern;

import java.text.MessageFormat;
import java.time.LocalDate;

import static br.com.likwi.functionalProgramming.functionalInterface.combinatorPattern.CustomerRegistrationValidator.*;

public class Main {
    static CustomerValidatorService customerValidatorService = new CustomerValidatorService();

    public static void main(String[] args) {
        final Customer customer = Customer.builder()
                .name("Ia")
                .email("ia@gmail.com")
                .phoneNumber("+011")
                .dob(LocalDate.of(2000, 1, 1))
                .build();

        System.out.println(
                MessageFormat.format("Is customer valid? {0}", customerValidatorService.isValid(customer))
        );

        //unsing combinator
        final ValidationResult validationResult = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(validationResult);
        if (validationResult != ValidationResult.SUCCESS) {
            throw new IllegalStateException(validationResult.name());
        }

    }
}
