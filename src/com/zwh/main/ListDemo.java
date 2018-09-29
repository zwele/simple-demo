package com.zwh.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,1,2,3);

        List<String> strs1=Arrays.asList("1_1","2_3");
        List<String> strs2 = Arrays.asList("1_1","2_3");
        System.out.println(strs1.equals(strs2) ? "相等":"No");

//        List<Integer> l3 = new ArrayList<>();
//        l3.addAll(l1);
//        l3.retainAll(l2);
//        System.out.println(l3);
//        System.out.println(l1);
//        System.out.println(l2);
//        l3.removeAll(l2);
//        System.out.println(l3.size());
//        System.out.println(l1);
//        System.out.println(l2);
//
//        String format = "1_2";
//        int index = format.indexOf("_");
//        Integer a = Integer.parseInt(format.substring(0,index));
//        Integer b = Integer.parseInt(format.substring(index+1));
//        System.out.println(a);
//        System.out.println(b);
    }
}
