package com.example.education.practice002;

import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.firstDayOfYear;

public class TypesTasks {
    public void NYDay(int years) {
        System.out.println(LocalDate.now().plusYears(years).with(firstDayOfYear()).getDayOfWeek());
    }
}
