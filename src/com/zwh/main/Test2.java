package com.zwh.main;

import com.zwh.entry.SupplierPrivilegeGradeListInput;
import com.zwh.entry.SupplierPrivilegeGradeListInput.SupplierPrivilegeGradeInput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<SupplierPrivilegeGradeInput> inputs = new ArrayList<>();

        SupplierPrivilegeGradeInput input1 = new SupplierPrivilegeGradeInput();
        input1.setPrivilegeGrade(0);
        input1.setGradeName("普通");
        input1.setUnlockScore(0);
        input1.setNoticeThreshold(null);

        SupplierPrivilegeGradeInput input2 = new SupplierPrivilegeGradeInput();
        input2.setPrivilegeGrade(1);
        input2.setGradeName("青铜");
        input2.setUnlockScore(500);
        input2.setNoticeThreshold(1800);

        SupplierPrivilegeGradeInput input3 = new SupplierPrivilegeGradeInput();
        input3.setPrivilegeGrade(2);
        input3.setGradeName("白银");
        input3.setUnlockScore(2000);
        input3.setNoticeThreshold(4900);

        SupplierPrivilegeGradeInput input4 = new SupplierPrivilegeGradeInput();
        input4.setPrivilegeGrade(3);
        input4.setGradeName("黄金");
        input4.setUnlockScore(5000);
        input4.setNoticeThreshold(8000);

        inputs.add(input1);
        inputs.add(input2);
        inputs.add(input3);
        inputs.add(input4);

        System.out.println(inputs.subList(1,3).toString());
//        SupplierPrivilegeGradeInput i = inputs.stream().max(Comparator.comparing(SupplierPrivilegeGradeInput::getPrivilegeGrade)).get();
//        i.setNoticeThreshold(null);
//
//        System.out.println(inputs);

//        SupplierPrivilegeGradeListInput listInput = new SupplierPrivilegeGradeListInput();
//        listInput.setGradeInputList(inputs);
//
////        System.out.println(listInput.checkParams());
//        inputs.forEach(e->e.setUnlockScore(40000));
//        System.out.println(inputs.toString());
    }
}
