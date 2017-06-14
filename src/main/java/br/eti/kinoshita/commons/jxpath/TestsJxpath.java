package br.eti.kinoshita.commons.jxpath;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.jxpath.JXPathContext;

public class TestsJxpath {

    public static void main(String[] args) {
        Phone p1 = new Phone(1);
        Phone p2 = new Phone(2);
        List<Phone> phones = new ArrayList<>();
        phones.add(p1);
        phones.add(p2);
        
        JXPathContext ctx = JXPathContext.newContext(phones);
        System.out.println(phones);
        long phone1 = (long) ctx.getValue("/*[type='br.eti.kinoshita.commons.jxpath.Phone']");
        System.out.println(phone1);
    }
}
