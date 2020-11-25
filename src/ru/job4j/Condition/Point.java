package ru.job4j.Condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double z1 = x2 - x1 ;
        z1 = Math.pow(z1, 2);
        double z2 = y2 - y1;
        z2 = Math.pow(z2, 2);
        double rsl = z1 + z2;
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}

