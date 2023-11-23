package com.example.mobilecomputingtask1;

public class Converter {
    public static final double ONE_DOLLAR = 30.92;
    public static double convertToEgyptian(double dollar) {
        return dollar * ONE_DOLLAR;
    }

    public static double convertToDollar(double egyptian) {
        return egyptian / ONE_DOLLAR;
    }
}
