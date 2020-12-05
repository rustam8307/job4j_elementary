package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (start = 0; start <= 10; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static int sum1(int start, int finish) {
        int sum = 0;
        for (start = 3; start <= 8; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static int sum2(int start, int finish) {
        int sum = 0;
        for (start = 1; start <= 1; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum1(3, 8));
        System.out.println(sum2(1, 1));
    }
}
