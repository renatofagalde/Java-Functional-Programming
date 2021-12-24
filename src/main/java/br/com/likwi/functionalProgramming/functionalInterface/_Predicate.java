package br.com.likwi.functionalProgramming.functionalInterface;

import java.text.MessageFormat;
import java.util.function.Predicate;

//function return a void
public class _Predicate {

    public static void main(String[] args) {

        final String phone07 = "0700";
        final String phone09 = "9999";
        System.out.println(isPhoneNumberValid(phone07));
        System.out.println(isPhoneNumberValid(phone09));
        System.out.println("*************");
        isPhoneNumberValidPredicate.test(phone07);
        isPhoneNumberValidPredicate.test(phone09);
        System.out.println("*************");
        System.out.println(MessageFormat.format(
                "Is phone number is valid and contains number zero = {0}",
                isPhoneNumberValidPredicate.and(isPhoneNumberContainsZeroPredicate).test(phone07)));
        System.out.println(MessageFormat.format(
                "Is phone number is valid and contains number zero = {0}",
                isPhoneNumberValidPredicate.and(isPhoneNumberContainsZeroPredicate).test(phone09)));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07")
                && phoneNumber.length() == 4;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07")
            && phoneNumber.length() == 4;
    static Predicate<String> isPhoneNumberContainsZeroPredicate = phoneNumber -> phoneNumber.contains("0");
}
