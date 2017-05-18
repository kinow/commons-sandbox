package br.eti.kinoshita.commons;

import java.util.Arrays;
import java.util.Objects;

public class ArrayComparison {

    public static void main(String[] args) {
        String[] a = {"A", "B"};
        String[] b = {"a", "b"};
        String[] c = {"A", "B"};
        System.out.println(Objects.equals(a, b));
        System.out.println(Objects.equals(a,  c));
        System.out.println(Arrays.equals(a,  b));
        System.out.println(Arrays.equals(a,  c));
    }
}
