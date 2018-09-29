package com.zwh.main;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        List<Person> allList = new ArrayList<>();
        //添加集合信息 省去。。。
        Person st1 = new Person();
        st1.setAge(20);
        st1.setHight(178L);
        st1.setSex(1);
        st1.setName("韩梅梅");
        allList.add(st1);
        Person st11 = new Person();
        st11.setAge(20);
        st11.setHight(168L);
        st11.setSex(1);
        st11.setName("马冬梅");
        allList.add(st11);

        Person st2 = new Person();
        st2.setAge(21);
        st2.setHight(179L);
        st2.setSex(2);
        st2.setName("李磊");
        allList.add(st2);
        Person st22 = new Person();
        st22.setAge(21);
        st22.setHight(189L);
        st22.setSex(2);
        st22.setName("小李");
        allList.add(st22);

        Person st3 = new Person();
        st3.setAge(21);
        st3.setHight(179L);
        st3.setSex(3);
        st3.setName("hu磊");
        allList.add(st3);
        Person st32 = new Person();
        st32.setAge(23);
        st32.setHight(189L);
        st32.setSex(3);
        st32.setName("小fs");
        allList.add(st32);

        // 以年龄 和 性别 分组，并选取最高身高的 学生
//        Map<Integer, Optional<Person>> allMapTask = allList.stream().collect(
//                Collectors.groupingBy(Person::getSex, Collectors.maxBy(Comparator.comparing(Person::getHight))));
//
//        // 遍历获取对象信息
//        for (Map.Entry<Integer,Optional<Person>> entry: allMapTask.entrySet()) {
//            Person student = entry.getValue().get();
//            System.out.println(student.toString());
//        }
        List<Person> personList = new ArrayList<>();
        Map<Integer, Optional<Person>> allMapTask = allList.stream().collect(
                Collectors.groupingBy(Person::getSex,Collectors.maxBy(Comparator.comparing(Person::getHight)))
        );
        for (Map.Entry<Integer,Optional<Person>> entry: allMapTask.entrySet()) {
            personList.add(entry.getValue().get());
        }
        personList.stream().sorted(Comparator.comparing(Person::getAge));
        System.out.println(personList);
    }
}
