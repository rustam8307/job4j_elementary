package ru.job4j.Condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return  ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}

