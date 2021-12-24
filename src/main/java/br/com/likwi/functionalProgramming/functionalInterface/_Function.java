package br.com.likwi.functionalProgramming.functionalInterface;

import java.text.MessageFormat;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(MessageFormat.format("By regular way {0}", incrementByOne(0)));

        final Integer incrementByFunction = incrementByOneFunction.apply(1);
        System.out.println(MessageFormat.format("By function {0}", incrementByFunction));

        final Integer multiply = _Function.multiplyBy10.apply(incrementByFunction);
        System.out.println("multiply = " + multiply);

        final Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);
        System.out.println("addBy1AndThenMultiplyBy10 = " + addBy1AndThenMultiplyBy10.apply(1));

        //the same of incrementByOneMultiply
        System.out.println("incrementByOneMultiplyBiFunction.apply(4, 100) = " + incrementByOneMultiplyBiFunction.apply(4, 100));

    }

    //T = Type
    //R = result (return)
    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int incrementByOne(int number) {
        return ++number;
    }

    static int incrementByOneMultiply(int number, int numberToMultiplyBy) {
        return (++number) * numberToMultiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

}
