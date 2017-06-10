package br.eti.kinoshita.commons;

import java.util.stream.IntStream;

public class Java8 {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 8).forEach((i) -> {
            System.out.println(String.format("hello %d", i));
        });
        System.out.println(new String("") instanceof Object);
    }
}
