package com.step.step7.generics;

public class IsEven <T extends Number> implements Predicate<T>{
    @Override
    public boolean apply(T num) {
        return num.doubleValue() % 2 == 0;
    }
}
