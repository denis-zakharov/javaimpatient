package ch02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import static java.lang.System.out;
import static java.time.LocalDate.of;

public class Ex11Cal {
    // Print from Monday to Sunday
    static void printMonthOfYear(int year, int month) {
        printMonthOfYear(year, month, DayOfWeek.MONDAY);
    }

    static void printMonthOfYear(int year, int month, DayOfWeek weekStart) {
        LocalDate date = of(year, month, 1);

        // header: days of a week
        DayOfWeek[] days = DayOfWeek.values();
        int weekDays = days.length;
        int dayOrdinal = weekStart.ordinal();
        for (int i = 0; i < weekDays; i++) {
            System.out.printf("%-12s", days[dayOrdinal % weekDays].getDisplayName(TextStyle.FULL, Locale.ENGLISH));
            dayOrdinal++;
        }
        out.println();

        // print offset from start of a week
        DayOfWeek firstDay = date.getDayOfWeek();
        int offset = (DayOfWeek.SUNDAY.getValue() - weekStart.getValue() + firstDay.getValue()) % weekDays;
        for (int i = 0; i < offset; i++) {
            out.printf("%-12s", "");
        }

        // print month calendar
        while (date.getMonthValue() == month) {
            out.printf("%-12d", date.getDayOfMonth());
            if (date.getDayOfWeek().equals(weekStart.minus(1))) {
                out.println();
            }
            date = date.plusDays(1);
        }
    }

    public static void main(String[] args) {
        printMonthOfYear(2018, 10); // from Monday
        out.printf("%n%n");
        printMonthOfYear(2018, 10, DayOfWeek.SUNDAY);
        out.printf("%n%n");
        printMonthOfYear(2018, 10, DayOfWeek.WEDNESDAY);
        out.printf("%n%n");
        printMonthOfYear(2018, 10, DayOfWeek.SATURDAY);
    }
}
