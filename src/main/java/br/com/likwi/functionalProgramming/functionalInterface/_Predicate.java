package br.com.likwi.functionalProgramming.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        final String phone07 = "0700";
        final String phone09 = "0600";
        System.out.println(isPhoneNumberValid(phone07));
        System.out.println(isPhoneNumberValid(phone09));
        System.out.println("*************");
        isPhoneNumberValidPredicate.test(phone07);
        isPhoneNumberValidPredicate.test(phone09);
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07")
                && phoneNumber.length() == 4;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07")
            && phoneNumber.length() == 4;
}
