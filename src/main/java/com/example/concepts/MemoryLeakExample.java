package com.example.concepts;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
    	long i = 0;
        while (i<100000000) {
            numbers.add(1);
            i++;
        }
    }
}

