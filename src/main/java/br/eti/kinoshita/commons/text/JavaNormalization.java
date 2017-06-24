package br.eti.kinoshita.commons.text;

import java.text.Normalizer;

public class JavaNormalization {

    public static void main(String[] args) {
        String s = "São Paulo";
        System.out.println(Normalizer.isNormalized(s, Normalizer.Form.NFKD));
        System.out.println(s);
        s = Normalizer.normalize(s, Normalizer.Form.NFKD);
        System.out.println(Normalizer.isNormalized(s, Normalizer.Form.NFKD));
        System.out.println(s);
        // TODO: how can I print the difference?
    }
}
