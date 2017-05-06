package br.eti.kinoshita.commons;

import org.apache.commons.text.similarity.JaroWinklerDistance;

import info.debatty.java.stringsimilarity.JaroWinkler;

public class JaroTests {

    public static void main(String[] args) {
        JaroWinklerDistance jd = new JaroWinklerDistance();
        Double dt = jd.apply("/opt/software1", "/opt/software2");
        System.out.println(dt);
        
        JaroWinkler jw = new JaroWinkler();
        dt = jw.similarity("/opt/software1", "/opt/software2");
        System.out.println(dt);
        
        
        
        dt = jd.apply("elephant", "hippo");
        System.out.println(dt);
    }

}
