package br.com.likwi.functionalProgramming.functionalInterface;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.text.MessageFormat;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    static final Customer ale = Customer.builder()
            .name("Ale")
            .customerPhoneNumber("99999")
            .build();
    static final Customer bia = Customer.builder()
            .name("Beatriz")
            .customerPhoneNumber("00000")
            .build();


    public static void main(String[] args) {
        greetCustomer(ale);
        greetCustomer(bia);
        System.out.println("********   Functional Interface  **********");
        greetCustumerConsumer.accept(ale);
        greetCustumerConsumer.accept(bia);

        greetCustumerBiConsumer.accept(bia, Boolean.FALSE);
        greetCustumerBiConsumer.accept(bia, Boolean.TRUE);
    }

    static Consumer<Customer> greetCustumerConsumer = customer -> System.out.println(
            MessageFormat.format("Hello {0}, thanks for registering phone number {1}",
                    customer.getName(), customer.getCustomerPhoneNumber()));

    static BiConsumer<Customer, Boolean> greetCustumerBiConsumer = (customer, showPhoneNumber) -> System.out.println(
            MessageFormat.format("Hello {0}, thanks for registering phone number {1}",
                    customer.getName(),
                    (showPhoneNumber ? customer.getCustomerPhoneNumber() : "***")));


    static void greetCustomer(Customer customer) {
        final String greet = MessageFormat.format("Hello {0}, thanks for registering phone number {1}", customer.getName(), customer.getName());
        System.out.println(greet);
    }

    @Data
    @AllArgsConstructor
    @Builder
    @ToString
    static class Customer {
        private final String name;
        private final String customerPhoneNumber;
    }

    private static void createCustomers() {
    }

}
