package org.example.e08date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // 현재 시간 획득
        LocalDateTime targetDate = LocalDateTime.of(
                2026,
                11,
                20,
                11,
                11
        );

        // ISO 표준 시계열 문자열 -> 날짜 객체
        LocalDateTime parsedDate1 = LocalDateTime.parse("2026-11-11T11:11:11");

        // ISO 표준 시계열 이외의 문자열 -> 날짜 객체 (포멧터를 이용)
        String date = "2026-11-01 11:30:12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDate2 = LocalDateTime.parse(date, dateTimeFormatter);

        System.out.println(parsedDate2);

        LocalDate now2 = LocalDate.now();
        System.out.println(now2);

        // 날짜 계산
        LocalDateTime addOneDayFromNow = now.plusDays(1L);

        System.out.println(now);
        System.out.println(addOneDayFromNow);

        // 상대적인 날짜 계산 (TemporalAdjusters)
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

        // 두 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2020, 12, 7);
        System.out.println(d1.isBefore(d2));
        System.out.println(d1.isAfter(d2));
        System.out.println(d1.isEqual(d2));

        // Period 객체: 두 날짜의 연/월/일을 단위로 분해해서 각각의 차를 구하는 객체
        Period p1 = Period.between(d1, d2);
        System.out.println(Math.abs(p1.getYears()));
        System.out.println(Math.abs(p1.getMonths()));
        System.out.println(Math.abs(p1.getDays()));

        // ChronoUnit 객체
        long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(Math.abs(untilDays));

        // LocalDateTime -> LocalDate 추출
        LocalDate extractLocalDateFromNow = now.toLocalDate();
        System.out.println(extractLocalDateFromNow);

        LocalDate start = LocalDate.of(2026, 9, 28);
        LocalDate curr = LocalDate.now();

        long progressDay = start.until(curr, ChronoUnit.DAYS);
        int totalHours = 0;
        ArrayList<LocalDate> holidays = new ArrayList<LocalDate>();
        holidays.add(LocalDate.of(2026, 10, 3));
        holidays.add(LocalDate.of(2026, 10, 5));
        holidays.add(LocalDate.of(2026, 10, 9));

        for (int i = 0; i <= progressDay; ++i) {
            if (start.plusDays(i).getDayOfWeek() == DayOfWeek.SATURDAY
            || start.plusDays(i).getDayOfWeek() == DayOfWeek.SUNDAY) {
                continue;
            }

            if (holidays.contains(start.plusDays(i))) {
                continue;
            }

            totalHours += 8;
        }

        System.out.println(totalHours);
    }
}
