package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr)
                .filter(a->a%2==0)
                .forEach(System.out::println);

        boolean result = Arrays.stream(arr)
                .filter(a->a%3==0)
                .allMatch(a->a%3==0);
        System.out.println(result);
    }
}
