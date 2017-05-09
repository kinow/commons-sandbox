package br.eti.kinoshita.commons.math;

import org.apache.commons.math4.stat.interval.ConfidenceInterval;
import org.apache.commons.math4.stat.interval.IntervalUtils;

public class ClopperPearsonInterval {

    public static void main(String[] args) {
        // case 1
        int numberOfTrials = 1;
        int numberOfSuccesses = 0;
        double confidenceLevel = 0.95;

        // both throw an exception
        // BinomialProportion.getClopperPearsonInterval(1, 0, 0.095);
        System.out.println("case 1:");
        ConfidenceInterval ci = IntervalUtils.getClopperPearsonInterval(numberOfTrials, numberOfSuccesses, confidenceLevel);
        System.out.println(ci);

        // case 2
        numberOfTrials = 1;
        numberOfSuccesses = 1;
        confidenceLevel = 0.95;

        System.out.println("case 2:");
        ci = IntervalUtils.getClopperPearsonInterval(numberOfTrials, numberOfSuccesses, confidenceLevel);
        System.out.println(ci);
        
        System.out.println("OK!");
    }

}
