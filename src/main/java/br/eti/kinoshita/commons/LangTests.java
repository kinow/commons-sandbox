package br.eti.kinoshita.commons;

import java.nio.charset.StandardCharsets;

public class LangTests {

    private final static String CONSTANT_CONSTANT_EXPRESSION = "UTF-8";
    private final static String CONSTANT_NOT_CONSTANT_EXPRESSION = StandardCharsets.UTF_8.name();
    
    public static void main(String[] args) {
        String var2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC (10L, "");
        System.out.println("Var2: [" + var2 + "]");
        switch (var2) {
        case CONSTANT_CONSTANT_EXPRESSION:
            System.out.println("OK");
            break;
        /*case CONSTANT_NOT_CONSTANT_EXPRESSION:
            System.out.println("Compilation error before this point...");
            break;*/
        default:
            break;
        }
    }

}
