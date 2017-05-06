package br.eti.kinoshita.commons;

public class LangTests {

    public static void main(String[] args) {
        String var2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC (10L, "");
        System.out.println("Var2: [" + var2 + "]");
    }

}
