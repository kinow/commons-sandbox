package br.eti.kinoshita.commons.math;

import org.apache.commons.math4.stat.inference.AlternativeHypothesis;
import org.apache.commons.math4.stat.inference.BinomialTest;

public class BinomialTestsTests {

    public static void main(String[] args) {
        int numberOfTrials = 200;
        int numberOfSuccesses = 200;
        double probability = 0.9950429;
        double d = (new BinomialTest()).binomialTest(numberOfTrials, numberOfSuccesses, probability,
                AlternativeHypothesis.TWO_SIDED);
        // not supposed to be above 1, as p-values are between (incl) 0 and 1
        System.out.println(d);
    }

}
