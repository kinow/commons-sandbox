package br.eti.kinoshita.commons.text;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Duration {

    public static void main(String[] args) {
        String duration = "30 days";
        java.time.Duration expected = java.time.Duration.of(30, ChronoUnit.DAYS);
    }
}
