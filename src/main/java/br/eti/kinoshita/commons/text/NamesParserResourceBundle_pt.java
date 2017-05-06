package br.eti.kinoshita.commons.text;

import java.util.Collections;
import java.util.Enumeration;

public class NamesParserResourceBundle_pt extends NamesParserResourceBundle {

    @Override
    protected Object handleGetObject(String key) {
        switch(key) {
        case "name":
            return "Nome";
        case "surname":
            return "Sobrenome";
        }
        return null;
    }

    @Override
    public Enumeration<String> getKeys() {
        return Collections.enumeration(keySet());
    }

}
