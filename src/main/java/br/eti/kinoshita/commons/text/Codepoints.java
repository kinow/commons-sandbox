package br.eti.kinoshita.commons.text;

import java.nio.charset.Charset;

import org.apache.commons.lang3.text.WordUtils;

public class Codepoints {

    public static void main(String[] args) throws Exception {
        String r = WordUtils.capitalize("bruno");
        System.out.println(r);
        String s = "𝕬b𝕬r𝕬u𝕬n𝕬o𝕬";
        System.out.println(s);
        r = WordUtils.capitalize(s);
        System.out.println(r);
        System.out.println("𝕬".length()); // 2 because of surrogate...
        System.out.println("𝕬".toCharArray().length);
        s = new String("𝕬".getBytes("UTF-16"), Charset.forName("UTF-8"));
        System.out.println(s);
        s = WordUtils.capitalize(s);
        System.out.println(s);
        String original = new String("A" + "\u00ea" + "\u00f1" + "\u00fc" + "C");
        System.out.println(original);
        String result = WordUtils.capitalize(original);
        System.out.println(result);
    }

}
