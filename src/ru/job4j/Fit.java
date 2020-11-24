package ru.job4j;

public class Fit {

        public static double manWeight(short heightM) {
            double rsl = (heightM - 100) * 1.15;
            return rsl;
        }

        public static double womanWeight(short heightW) {
            double rsl = (heightW - 110) * 1.15;
            return rsl;
        }

        public static void main(String[] args) {
            short heightM = 187;
            short heightW = 169;
            double man = Fit.manWeight(heightM);
            double woman = Fit.womanWeight(heightW);
            System.out.println("Man 187 is " + man);
            System.out.println("Woman 169 is " + woman);
        }

    }

