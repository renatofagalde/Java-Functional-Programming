package br.com.likwi.functionalProgramming.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println("getDBConnectionURL() = " + getDBConnectionURL());
        System.out.println("getDBConnectionURLSupplier = " + getDBConnectionURLSupplier.get());
    }

    static String getDBConnectionURL() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionURLSupplier = () -> "jdbc://localhost:5432/users";
}
