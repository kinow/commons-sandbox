package br.eti.kinoshita.commons.collection;

import java.text.ParseException;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) throws ParseException {
        SortedMap<String, String> sorted = new TreeMap<String, String>((Comparator<String>) null);
        sorted.put("a", "A");
        sorted.put("b", "B");
        sorted.put("c", "C");
        
        System.out.println(sorted.firstKey());
        System.out.println(sorted.tailMap("b"));
        
        NavigableMap<String, String> navigable = new TreeMap<String, String>((Comparator<String>) null);
        navigable.put("a", "A");
        navigable.put("b", "B");
        navigable.put("c", "C");
        
        System.out.println(navigable.descendingKeySet());
        System.out.println(navigable.floorKey("d"));
        System.out.println(navigable.higherKey("b"));
        
        /*
a
{b=B, c=C}
[c, b, a]
c
c
         */
    }

}
