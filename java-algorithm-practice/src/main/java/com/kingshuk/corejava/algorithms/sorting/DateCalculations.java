package com.kingshuk.corejava.algorithms.sorting;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.function.Predicate;
import java.util.stream.Stream;

@SuppressWarnings({"java:S106", "java:S125"})
public class DateCalculations {

    public static void main(String[] args) {
        LocalDate terminationDate = LocalDate.of(2023, Month.JUNE, 23);
        LocalDate h1bEndDate = terminationDate.plusDays(60);
        System.out.println("Grace period end date: " + h1bEndDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        LocalDate startDate = LocalDate.now();

        //LCA Date calculation
        LocalDate lcaFilingDate = LocalDate.of(2023, Month.JULY, 13);
        LocalDate tentativeLCAApprovalDate = businessDaysCalculationForDate(lcaFilingDate, 7);
        System.out.println("Tentative LCA Certification date: " + tentativeLCAApprovalDate);

        //H1B Date calculation
        LocalDate tentativeH1FilingDate = tentativeLCAApprovalDate.plusDays(2);
        LocalDate tentativeH1bApprovalDate = tentativeH1FilingDate.plusDays(15);
        System.out.println("Tentative H1B Approval date: " + tentativeH1bApprovalDate);

        long calendarDaysToGo = ChronoUnit.DAYS.between(tentativeH1FilingDate, h1bEndDate.plusDays(1));
        System.out.println(calendarDaysToGo +
                " calendar days till grace period expiry after tentative file date - " +
                tentativeH1FilingDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        System.out.println(ChronoUnit.DAYS.between(startDate, h1bEndDate.plusDays(1)) +
                " calendar days till grace period expiry from today ");

        businessDaysCalculation(startDate, h1bEndDate);
        businessDaysCalculation(tentativeH1FilingDate, h1bEndDate);

        if(h1bEndDate.isAfter(tentativeH1bApprovalDate)) {
            long between = ChronoUnit.DAYS.between(tentativeH1bApprovalDate, h1bEndDate.plusDays(1));
            System.out.println("NO NEED TO WORRY!! EVERYTHING IS GOING TO BE DONE IN TIME WITH " + between + " DAYS TO SPARE");
        }else{
            System.out.println("PACK YOUR BAGS. SORRY!!");
        }
    }

    private static void businessDaysCalculation(LocalDate startDate, LocalDate h1bEndDate) {
        long daysToGo = ChronoUnit.DAYS.between(startDate, h1bEndDate.plusDays(1));
        Predicate<LocalDate> weekendDays = date -> (date.getDayOfWeek() == DayOfWeek.SUNDAY
                || date.getDayOfWeek() == DayOfWeek.SATURDAY);

        long numberOfBusinessDays = Stream.iterate(startDate, date -> date.plusDays(1))
                .limit(daysToGo)
                .filter(weekendDays.negate())
                .count();

        if(startDate.isEqual(LocalDate.now())){
            System.out.println(numberOfBusinessDays + " business days till grace period expiry from today");
        }else{
//            System.out.println(numberOfBusinessDays + " business days till grace period expiry from " +
//                    startDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
            System.out.println(numberOfBusinessDays + " business days till grace period expiry from H1B filing date - " +
                    startDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        }
    }


    private static LocalDate businessDaysCalculationForDate(LocalDate startDate, int numberOfBusinessDays) {
        while(numberOfBusinessDays!=0){
            startDate = startDate.plusDays(1);
            if(startDate.getDayOfWeek() != DayOfWeek.SUNDAY
                    && startDate.getDayOfWeek() != DayOfWeek.SATURDAY){
                numberOfBusinessDays--;
            }
        }

        return startDate;
    }
}
