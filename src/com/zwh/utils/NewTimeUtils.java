package com.zwh.utils;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class NewTimeUtils {

    public static final DateTimeFormatter YEAR_MONTH_DAY = DateTimeFormatter.ofPattern("yyyy年M月d日");
    public static final DateTimeFormatter MONTH_DAY = DateTimeFormatter.ofPattern("M月d日");
    public static final DateTimeFormatter DAY = DateTimeFormatter.ofPattern("d日");

    /**
     * 永久时间：9999/12/31 23:59:59
     * @return
     */
    public static Date getPermanentTime(){
       return Date.from(LocalDate.of(9999,12,31).atTime(23,59,59).toInstant(ZoneOffset.of("+8")));
    }


    /**
     * 本月第一天：2018/09/01 00:00:00
     * @return
     */
    public static Date getThisMonthFirstDay(){
        return Date.from(LocalDate.now().withDayOfMonth(1).atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 本月第一天的最后时刻：2018/09/01 23:59:59
     * @return
     */
    public static Date getThisMonthFirstDayLastSecond(){
        return Date.from(LocalDate.now().withDayOfMonth(1).atTime(23,59,59).toInstant(ZoneOffset.of("+8")));
    }

    /**
     * 本月最后一天最后时刻：2018/09/30 23:59:59
     * @return
     */
    public static Date getThisMonthLastDayLastSecond(){
        int lengthOfMonth = LocalDate.now().lengthOfMonth();
        return Date.from(LocalDate.now().withDayOfMonth(lengthOfMonth).atTime(23,59,59).toInstant(ZoneOffset.of("+8")));
    }
    /**
     * 下个月第一天：2018/10/01 00:00:00
     * @return
     */
    public static Date getNextMonthFirstDay(){
        return Date.from(LocalDate.now().plusMonths(1).withDayOfMonth(1).atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 下个月第一天的最后时刻：2018/10/01 23:59:59
     * @return
     */
    public static Date getNextMonthFirstDayLastSecond(){
        return Date.from(LocalDate.now().plusMonths(1).withDayOfMonth(1).atTime(23,59,59).toInstant(ZoneOffset.of("+8")));
    }

    /**
     * 下个月第二天 ：2018/10/02 00:00:00
     * @return
     */
    public static Date getNextMonthSecondDay(){
        return Date.from(LocalDate.now().plusMonths(1).withDayOfMonth(2).atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 下个月最后一天最后时刻：2018/10/31 23:59:59
     * @return
     */
    public static Date getNextMonthLastDayLastSecond(){
        int lengthOfMonth = LocalDate.now().plusMonths(1).lengthOfMonth();
        return Date.from(LocalDate.now().plusMonths(1).withDayOfMonth(lengthOfMonth).atTime(23,59,59).toInstant(ZoneOffset.of("+8")));
    }

    /**
     * 上个月第一天 2018/08/01 00:00:00
     * @return
     */
    public static Date getLastMonthFirstDay(){
        return Date.from(LocalDate.now().minusMonths(1).withDayOfMonth(1).atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 上个月最后一天最后时刻 2018/08/31 23:59:59
     * @return
     */
    public static Date getLastMonthLastDayLastSecond(){
        int lengthOfMonth = LocalDate.now().minus(1,ChronoUnit.MONTHS).lengthOfMonth();
        return Date.from(LocalDate.now().minusMonths(1).withDayOfMonth(lengthOfMonth).atTime(23,59,59).toInstant(ZoneOffset.of("+8")));
    }

    /**
     * 将Date转换成LocalDateTime
     * @param date
     * @return
     */
    public static LocalDate transferFromDate(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * 输出格式：Z年Z月Z日
     * @param date
     * @return
     */
    public static String formatDate(Date date){
        return transferFromDate(date).format(YEAR_MONTH_DAY);
    }

    /**
     * 输出格式：Z月Z日
     * @param date
     * @return
     */
    public static String formatDateMonthAndDay(Date date) {
        return transferFromDate(date).format(MONTH_DAY);
    }

    /**
     * 输出格式：Y日
     * @param date
     * @return
     */
    public static String formatDateDay(Date date) {
       return transferFromDate(date).format(DAY);
    }
    /**
     * 输出格式：Z月Z日-Y日
     * @param startDate
     * @param endDate
     * @return
     */
    public static String formatRangeDate(Date startDate, Date endDate) {
        return formatDateMonthAndDay(startDate)+"-"+formatDateDay(endDate);
    }

    /**
     * 输出格式：Z月Z日-Y月Y日
     * @param startDate
     * @param endDate
     * @return
     */
    public static String formatTimeInterval(Date startDate, Date endDate) {
        return formatDateMonthAndDay(startDate)+"-"+formatDateMonthAndDay(endDate);
    }

    public static void main(String[] args){
//        System.out.println(getThisMonthFirstDay());
//
//       System.out.println(getThisMonthFirstDayLastSecond());
//
//       System.out.println(getThisMonthLastDay());
//       System.out.println(LocalDate.now().minus(1,ChronoUnit.MONTHS).lengthOfMonth());

//        System.out.println(getPermanentTime());

//        System.out.println(getNextMonthFirstDayLastSecond());

//        System.out.println(getNextMonthLastDayLastSecond());

//        System.out.println(getNextMonthSecondDay());
//        System.out.println(getLastMonthFirstDay());

//        System.out.println(getLastMonthLastDayLastSecond());
//        System.out.println(formatDate(new Date()));

        System.out.println(formatDate(new Date()));//2018年9月27日
        System.out.println(formatDateDay(new Date()));//27日
        System.out.println(formatDateMonthAndDay(new Date()));//9月27日

        System.out.println(formatRangeDate(getThisMonthFirstDay(),getThisMonthLastDayLastSecond()));//9月1日-30日
        System.out.println(formatTimeInterval(getThisMonthFirstDay(),getThisMonthLastDayLastSecond()));//9月1日-9月30日
    }
}
