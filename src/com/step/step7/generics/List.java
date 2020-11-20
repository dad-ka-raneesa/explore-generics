package com.step.step7.generics;


public class List <T extends Number> {
    private final T[] list;

    public List(T[] list) {
        this.list = list;
    }

    public double average() {
        double sum = 0;
        for (T item : this.list) {
            sum += item.doubleValue();
        }
        return sum/this.list.length;
    }

    public boolean contains(Predicate<T> predicate) {
        for (T item : this.list) {
            if(predicate.apply(item)){
                return true;
            }
        }
        return false;
    }
}
