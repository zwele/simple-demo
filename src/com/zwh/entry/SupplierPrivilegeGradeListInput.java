package com.zwh.entry;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SupplierPrivilegeGradeListInput {

    public List<SupplierPrivilegeGradeInput> getGradeEditInputList() {
        return gradeEditInputList;
    }

    public void setGradeInputList(List<SupplierPrivilegeGradeInput> gradeInputList) {
        this.gradeEditInputList = gradeInputList;
    }

    List<SupplierPrivilegeGradeInput> gradeEditInputList;

    public static class SupplierPrivilegeGradeInput{
        private Integer privilegeGrade;

        private String gradeName;

        private Integer unlockScore;

        private Integer noticeThreshold;

        public Integer getPrivilegeGrade() {
            return privilegeGrade;
        }

        public void setPrivilegeGrade(Integer privilegeGrade) {
            this.privilegeGrade = privilegeGrade;
        }

        public String getGradeName() {
            return gradeName;
        }

        public void setGradeName(String gradeName) {
            this.gradeName = gradeName;
        }

        public Integer getUnlockScore() {
            return unlockScore;
        }

        public void setUnlockScore(Integer unlockScore) {
            this.unlockScore = unlockScore;
        }

        public Integer getNoticeThreshold() {
            return noticeThreshold;
        }

        public void setNoticeThreshold(Integer noticeThreshold) {
            this.noticeThreshold = noticeThreshold;
        }

        @Override
        public String toString() {
            return "SupplierPrivilegeGradeInput{" +
                    "privilegeGrade=" + privilegeGrade +
                    ", gradeName='" + gradeName + '\'' +
                    ", unlockScore=" + unlockScore +
                    ", noticeThreshold=" + noticeThreshold +
                    '}';
        }
    }

    public String checkParams() {
        gradeEditInputList = gradeEditInputList.stream()
                .sorted(Comparator.comparing(SupplierPrivilegeGradeInput::getPrivilegeGrade))
                .collect(Collectors.toList());

        //检查参数的合法性
        int gradeListSize = gradeEditInputList.size();

        for(int index = 0; index<gradeListSize;index++) {
            SupplierPrivilegeGradeInput input = gradeEditInputList.get(index);

            if(index==gradeListSize-1) {
                if(!Objects.isNull(input.noticeThreshold)) {
                    return "最高等级商家的通知阈值应为空";
                }
                break;
            }

            if(Objects.isNull(input.getNoticeThreshold())) {
                return "非最高等级商家的通知阈值不能为空";
            }

            if(input.getUnlockScore() < 0 || input.getNoticeThreshold() < 0) {
                return "解锁分数或通知阈值不能为负数";
            }

            SupplierPrivilegeGradeInput nextInput = gradeEditInputList.get(index+1);

            if(index==0 && input.getUnlockScore()!=0) {
                return "最低等级商家的解锁分数应为0";
            }

            if(input.getUnlockScore() >= nextInput.getUnlockScore()) {
                return "存在不合法的解锁分数";
            }

            if(input.getNoticeThreshold() >= nextInput.getUnlockScore() || input.getNoticeThreshold() <= input.getUnlockScore()) {
                return "存在不合法的通知阈值";
            }
        }

        return null;
    }
}
