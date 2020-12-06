package ru.job4j.Condition;

public class MultipleSwitchWeek {
    public int numberOfDay(String name) {
        int i;
        switch (name) {
            case "Понедельник":
            case "Monday":
                i = 1;
                break;
            case "Вторник":
            case "Tuesday":
                i = 2;
                break;
            case "Среда":
            case "Wednesday":
                i = 3;
                break;
            case "Четверг":
            case "Thursday":
                i = 4;
                break;
            case "Пятница":
            case "Friday":
                i = 5;
                break;
            case "Суббота":
            case "Saturday":
                i = 6;
                break;
            case "Воскресенье":
            case "Sunday":
                i = 7;
                break;
            default:
                i = -1;
                break;
        }
        return i;
    }
}
