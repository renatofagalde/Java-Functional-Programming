package br.com.likwi.functionalProgramming.functionalInterface;

import java.text.MessageFormat;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(MessageFormat.format("By regular way {0}",incrementByOne(0)));

        final Integer integer = incrementByOneFunction.apply(1);
        System.out.println(MessageFormat.format("By function {0}",integer));


    }
    //T = Type
    //R = result (return)
    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static int incrementByOne(int number) {
        return ++number;
    }
}
