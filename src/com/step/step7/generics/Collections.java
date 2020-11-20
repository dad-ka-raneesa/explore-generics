package com.step.step7.generics;

public class Collections <T extends Comparable<T>>{
    private final T[] items;

    public Collections(T[] items) {
        this.items = items;
    }

    public T maximum() {
        T max = this.items[0];
        for (T item : this.items) {
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }

    public T minimum() {
        T min = this.items[0];
        for (T item : this.items) {
            if(item.compareTo(min) < 0){
                min = item;
            }
        }
        return min;
    }
}
