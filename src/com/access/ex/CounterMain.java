package com.access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.indrement();
        counter.indrement();
        counter.indrement();
        counter.indrement();
        int count = counter.getCount();
        System.out.println(count);
    }
}
