package com.zwh.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期、时间常用工具
 *
 */
public class TimeUtils {
    /**
     * 永久的时间 9999-12-31 23:59:59
     * @return
     */
    public static Date getPermanentPTime(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(9999,11,31,23,59,59);
        return calendar.getTime();
    }

    public static void main(String[] args){
        System.out.println(formatDate(getFirstDayLastSecondOfNextMonth(new Date())));
    }
    /**
     * 下个月第一天
     * @param date
     * @return
     */
    public static Date getFirstDayOfNextMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,1);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTime();
    }
    /**
     * 下个月第一天最后时间 例：2018/10/1/ 23:59:59
     * @param date
     * @return
     */
    public static Date getFirstDayLastSecondOfNextMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        return calendar.getTime();
    }

    /**
     * 下个月最后一天
     * @param date
     * @return
     */
    public static Date getLastDayOfNextMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,2);
        calendar.set(Calendar.DAY_OF_MONTH,0);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        return calendar.getTime();
    }

    /**
     * 下个月第2天
     * @return
     */
    public static Date getSecondDayOfNextMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,1);
        calendar.set(Calendar.DAY_OF_MONTH,2);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTime();
    }

    /**
     * 本月第一天
     */
    public static Date getFirstDayOfMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTime();
    }

    /**
     * 本月最后一天
     * @param date
     * @return
     */
    public static Date getLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,1);
        calendar.set(Calendar.DAY_OF_MONTH,0);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        return calendar.getTime();
    }
    /**
     * 上个月的第一天
     * @param date
     * @return
     */
    public static Date getFirstDayOfLastMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);

        return calendar.getTime();
    }

    /**
     * 上个月的最后一天
     * @param date
     * @return
     */
    public static Date getLastDayOfLastMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        return calendar.getTime();
    }

    /**
     * 上上个月最后一天
     * @param date
     * @return
     */
    public static Date getLastDayOfLastLastMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        return calendar.getTime();
    }
    /**
     * 输出格式：Z年Z月Z日
     * @param date
     * @return
     */
    public static String formatDate(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return String.format(year+"年"+month+"月"+day+"日");
    }

    /**
     * 输出格式：Z月Z日
     * @param date
     * @return
     */
    public static String formatDateMonthAndDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return String.format(month+"月"+day+"日");
    }

    /**
     * 输出格式：Y日
     * @param date
     * @return
     */
    public static String formatDateDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return String.format(day+"日");
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
}
