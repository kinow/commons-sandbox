package br.eti.kinoshita.commons.text;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

public class NamesParserResourceBundle extends ResourceBundle {

    @Override
    protected Object handleGetObject(String key) {
        switch(key) {
        case "name":
            return "Name";
        case "surname":
            return "Surname";
        }
        return null;
    }

    @Override
    public Enumeration<String> getKeys() {
        return Collections.enumeration(keySet());
    }
    
    @Override
    protected Set<String> handleKeySet() {
        return new HashSet<String>(Arrays.asList("name", "surname"));
    }

}
