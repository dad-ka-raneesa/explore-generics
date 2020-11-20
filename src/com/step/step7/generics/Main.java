package com.step.step7.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {2, 9, 4, 5};
        final List<Integer> integerList = new List<>(integers);
        System.out.println("Integers avg = " + integerList.average());

        Double[] doubles = {4.2, 2.2, 8.32, 6.23};
        final List<Double> doubleList = new List<>(doubles);
        System.out.println("Doubles avg = " + doubleList.average());

        System.out.println(integerList.contains(new IsEven<>()::apply));
        System.out.println(doubleList.contains(new IsEven<>()::apply));

        System.out.println(integerList.contains(Main::apply));
        System.out.println(doubleList.contains(Main::apply));


        System.out.println(integerList.contains(num -> num % 2 == 0));
        System.out.println(doubleList.contains(num -> num % 2 == 0));
    }

    private static <T extends Number>boolean apply(T item) {
        return !(new IsEven<>().apply(item));
    }
}
