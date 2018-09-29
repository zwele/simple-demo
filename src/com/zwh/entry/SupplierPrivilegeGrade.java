package com.zwh.entry;

import java.util.Date;

public class SupplierPrivilegeGrade {
    private Long id;

    private String name;

    private Integer privilegeGrade;

    private Integer unlockScore;

    private Date effectiveTime;

    private Date createTime;

    private Date updateTime;

    public SupplierPrivilegeGrade(){}

    public SupplierPrivilegeGrade(Long id,String name,Integer privilegeGrade,Integer unlockScore){
        this.id = id;
        this.name = name;
        this.privilegeGrade = privilegeGrade;
        this.unlockScore = unlockScore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrivilegeGrade() {
        return privilegeGrade;
    }

    public void setPrivilegeGrade(Integer privilegeGrade) {
        this.privilegeGrade = privilegeGrade;
    }

    public Integer getUnlockScore() {
        return unlockScore;
    }

    public void setUnlockScore(Integer unlockScore) {
        this.unlockScore = unlockScore;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}