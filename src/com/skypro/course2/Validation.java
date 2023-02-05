package com.skypro.course2;

public class Validation {
    public static String validateStringPar(String string, String substitution) {
        return (string == null || string.isBlank() || string.isEmpty()) ? substitution : string;
    }
    public static double validateDoublePar(double value, double substitution) {
        return (value <= 0.0) ? substitution : value;
    }
}
