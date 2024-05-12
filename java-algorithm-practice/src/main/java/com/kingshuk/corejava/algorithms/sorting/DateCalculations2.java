package com.kingshuk.corejava.algorithms.sorting;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.function.Predicate;
import java.util.stream.Stream;

@SuppressWarnings({"java:S106", "java:S125"})
public class DateCalculations2 {

    public static void main(String[] args) {
        LocalDate dateFrom = LocalDate.of(2023, Month.AUGUST, 14);
        LocalDate dateTo = LocalDate.of(2023, Month.DECEMBER, 31);

        System.out.println(ChronoUnit.DAYS.between(dateFrom, dateTo));

        LocalDate joiningDate = LocalDate.of(2023, Month.AUGUST, 14);
        System.out.println(joiningDate.plusMonths(6));
    }





}
