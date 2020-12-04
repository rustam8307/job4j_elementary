package ru.job4j.Condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        if (third > second && third > first) {
            result = third;
        }
        return result;
    }
}
