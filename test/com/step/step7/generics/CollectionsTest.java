package com.step.step7.generics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectionsTest {
    @Test
    public void shouldGiveMaxOfIntegerArray() {
        Integer[] integers = {2, 1, 3, 8, 4, 5, 7};
        final Collections<Integer> integerCollections = new Collections<>(integers);
        assertEquals(8, integerCollections.maximum().intValue());
    }

    @Test
    public void shouldGiveMinOfIntegerArray() {
        Integer[] integers = {2, 1, 3, 8, 4, 5, 7};
        final Collections<Integer> integerCollections = new Collections<>(integers);
        assertEquals(1, integerCollections.minimum().intValue());
    }

    @Test
    public void shouldGiveMaxOfDoubleArray() {
        Double[] doubles = {7.0, 2.7, 9.4, 8.0, 4.0, 5.5, 7.3};
        final Collections<Double> integerCollections = new Collections<>(doubles);
        assertEquals(9.4, integerCollections.maximum().doubleValue(), 0);
    }

    @Test
    public void shouldGiveMinOfDoubleArray() {
        Double[] doubles = {7.0, 2.7, 9.4, 8.0, 4.0, 5.5, 7.3};
        final Collections<Double> integerCollections = new Collections<>(doubles);
        assertEquals(2.7, integerCollections.minimum().doubleValue(), 0);
    }

    @Test
    public void shouldGiveMaxOfStringsArray() {
        String[] strings = {"hello", "Hello", "hi", "be", "To", "Be", "Some"};
        final Collections<String> integerCollections = new Collections<>(strings);
        assertEquals("hi", integerCollections.maximum());
    }

    @Test
    public void shouldGiveMinOfStringsArray() {
        String[] strings = {"hello", "Hello", "hi", "be", "To", "Be", "Some"};
        final Collections<String> integerCollections = new Collections<>(strings);
        assertEquals("Be", integerCollections.minimum());
    }
}
