package com.zwh.main;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.*;
import java.util.List;
import java.util.ArrayList;
public class Demo2 {

    public static void main(String[] args) {
//        UUID uniqueID = UUID.randomUUID();
//        System.out.println(uniqueID.toString());
//
//        Map<String,String> request = new HashMap<>();
//
//        request.put("/switch/save","cityId=2");
//        System.out.println(request.toString());

//        String format = "supplier:%s:%s";
//        String key = String.format(format,new Integer(2),34);
//        System.out.print(key);
//
//        Lock lock = new ReentrantLock();
//        Condition condition  = lock.newCondition();
//
//        List<Integer> cityIds = new ArrayList<>();

//        //cityIds.add(2);
//        if(cityIds.contains(1)){
//            System.out.println("contians null");
//        }else{
//            System.out.println("contians not null");
//        }
        /**
         * 下月第一天
         */
        Date firstDayOfNextMonth = Date.from(LocalDate.now().plusMonths(1).withDayOfMonth(1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(firstDayOfNextMonth);

        /**
         * 指定某年某月某日
         */
        Date date = Date.from(LocalDate.of(2017,1,1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(date);

        /**
         * 本月第一天
         */
        Date firstDayOfMonth = Date.from(LocalDate.now().withDayOfMonth(1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(firstDayOfMonth);

        /**
         * 上月第一天
         */
        Date firstDayOfLastMonth = Date.from(LocalDate.now().minusMonths(1).withDayOfMonth(1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(firstDayOfLastMonth);

        /**
         * 本月最后一天
         */
        Date lastDayOfMonth = Date.from(LocalDate.now().withDayOfMonth(LocalDate.now().lengthOfMonth()).atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(lastDayOfMonth);
    }
}
