package ch02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex01Cal {
    // Print from Monday to Sunday
    static void printMonthOfYear(int year, int month) {
        printMonthOfYear(year, month, DayOfWeek.MONDAY);
    }

    static void printMonthOfYear(int year, int month, DayOfWeek weekStart) {
        LocalDate date = LocalDate.of(year, month, 1);

        // header: days of a week
        DayOfWeek[] days = DayOfWeek.values();
        int weekDays = days.length;
        int dayOrdinal = weekStart.ordinal();
        for (int i = 0; i < weekDays; i++) {
            System.out.printf("%-12s", days[dayOrdinal % weekDays].getDisplayName(TextStyle.FULL, Locale.ENGLISH));
            dayOrdinal++;
        }
        System.out.println();

        // print offset from start of a week
        DayOfWeek firstDay = date.getDayOfWeek();
        int offset = (DayOfWeek.SUNDAY.getValue() - weekStart.getValue() + firstDay.getValue()) % weekDays;
        for (int i = 0; i < offset; i++) {
            System.out.printf("%-12s", "");
        }

        // print month calendar
        while (date.getMonthValue() == month) {
            System.out.printf("%-12d", date.getDayOfMonth());
            if (date.getDayOfWeek().equals(weekStart.minus(1))) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }

    public static void main(String[] args) {
        printMonthOfYear(2018, 10); // from Monday
        System.out.printf("%n%n");
        printMonthOfYear(2018, 10, DayOfWeek.SUNDAY);
        System.out.printf("%n%n");
        printMonthOfYear(2018, 10, DayOfWeek.WEDNESDAY);
        System.out.printf("%n%n");
        printMonthOfYear(2018, 10, DayOfWeek.SATURDAY);
    }
}
