package br.eti.kinoshita.commons.collection;

import java.util.Collection;

import org.apache.commons.collections4.CollectionUtils;

import com.google.common.collect.Iterators;

public class Null {

    public static void main(String[] args) {
        System.out.println(Iterators.elementsEqual(null, null));
        Collection<String> c = null;
        System.out.println(CollectionUtils.isEmpty(c)); // return true
        System.out.println(CollectionUtils.isFull(c));  // throws a NPE
    }

}
