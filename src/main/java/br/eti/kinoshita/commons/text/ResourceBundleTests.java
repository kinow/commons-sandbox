package br.eti.kinoshita.commons.text;

import java.util.Locale;
import java.util.ResourceBundle;

// find a way to create an abstract layer in order to support multiple languages in [text]
public class ResourceBundleTests {

    public static void main(String[] args) {
        Locale l1 = Locale.forLanguageTag("pt-PT");
        Locale l2 = Locale.forLanguageTag("en-US");
        ResourceBundle rb = ResourceBundle.getBundle("br.eti.kinoshita.commons.text.NamesParserResourceBundle", l1);
        System.out.println(rb.getString("name"));
    }

}
