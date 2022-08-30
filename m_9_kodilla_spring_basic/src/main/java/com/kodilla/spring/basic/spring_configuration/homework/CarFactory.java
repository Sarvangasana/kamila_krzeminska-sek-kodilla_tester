package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public Car selectCarAccordingToSeasons() {
        Random random = new Random();
        Calendar calendar = new GregorianCalendar(random.nextInt(23)+2000, random.nextInt(12),
                random.nextInt(32), random.nextInt(25), random.nextInt(61));
        Calendar calendar2 = new GregorianCalendar(random.nextInt(23)+2000, random.nextInt(12),
                random.nextInt(32), random.nextInt(25), random.nextInt(61));
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year2 = calendar2.get(Calendar.YEAR);
        int month2 = calendar2.get(Calendar.MONTH);
        int day2 = calendar2.get(Calendar.DAY_OF_MONTH);
        int test = calendar.compareTo(calendar);
        int test2 = calendar.compareTo(calendar2);
        if (isSummer(calendar))  {
            return new Cabrio(isNight(calendar));
//            car.getCarType();
//            car.hasHeadlightsTurnedOn();
        } else if (isWinter(calendar)) {
            return new Suv(isNight(calendar));
        } else {
            return new Sedan(isNight(calendar));
        }
    }

    private boolean isNight(Calendar date) {
        return (date.get(date.HOUR) >= 20 || date.get(date.HOUR) <= 6);
    }

    private boolean isSummer(Calendar date) {
        Calendar beginOfThisSummer = new GregorianCalendar(date.get(date.YEAR), 5, 22);
        Calendar endOfThisSummer = new GregorianCalendar(date.get(date.YEAR), 8, 22);
        boolean a = date.compareTo(beginOfThisSummer) >= 0;
        int a1 = date.compareTo(beginOfThisSummer);
        boolean b = date.compareTo(endOfThisSummer) <= 0;
        int b1 =date.compareTo(endOfThisSummer);
        return (date.compareTo(beginOfThisSummer) >= 0 && date.compareTo(endOfThisSummer) <= 0);
    }

    private boolean isWinter(Calendar date) {
        Calendar beginOfThisWinter = new GregorianCalendar(date.get(date.YEAR), 11, 22);
        Calendar endOfThisWinter = new GregorianCalendar(date.get(date.YEAR+1), 2, 20);
        Calendar beginOfPreviousWinter = new GregorianCalendar(date.get(date.YEAR-1), 11, 22);
        Calendar endOfPreviousWinter = new GregorianCalendar(date.get(date.YEAR), 2, 20);
        boolean a = date.compareTo(beginOfThisWinter) >= 0;
        int a1 = date.compareTo(beginOfThisWinter);
        boolean b =  date.compareTo(endOfThisWinter) <= 0;
        int b1 =  date.compareTo(endOfThisWinter);
        boolean c = (date.compareTo(beginOfPreviousWinter)) >= 0;
        int c1 = date.compareTo(beginOfPreviousWinter);
        boolean d = date.compareTo(endOfPreviousWinter) <= 0;
        int d1 = date.compareTo(endOfPreviousWinter);
        return (date.compareTo(beginOfThisWinter) >= 0 && date.compareTo(endOfThisWinter) <= 0)
                || (date.compareTo(beginOfPreviousWinter) >= 0 && date.compareTo(endOfPreviousWinter) <= 0);
    }

}
