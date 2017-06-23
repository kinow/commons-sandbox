package br.eti.kinoshita.commons.jexl.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

// https://issues.apache.org/jira/browse/JEXL-227
public class Scripts {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");
        System.out.println("ENGINE: " + engine.getFactory().getEngineVersion());
        System.out.println("LANGUAGE: " + engine.getFactory().getLanguageVersion());
    }
}
