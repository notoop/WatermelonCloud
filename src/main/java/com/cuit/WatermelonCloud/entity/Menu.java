package com.cuit.WatermelonCloud.entity;

import java.io.Serializable;

/**
 * (Menu)实体类
 *
 * @author makejava
 * @since 2021-07-04 01:00:59
 */
public class Menu implements Serializable {
    private static final long serialVersionUID = 133013289813777470L;
    
    private Integer mId;
    
    private Integer mUserType;
    
    private Integer mTypeOrder;
    
    private String mName;


    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public Integer getMUserType() {
        return mUserType;
    }

    public void setMUserType(Integer mUserType) {
        this.mUserType = mUserType;
    }

    public Integer getMTypeOrder() {
        return mTypeOrder;
    }

    public void setMTypeOrder(Integer mTypeOrder) {
        this.mTypeOrder = mTypeOrder;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mId=" + mId +
                ", mUserType=" + mUserType +
                ", mTypeOrder=" + mTypeOrder +
                ", mName='" + mName + '\'' +
                '}';
    }
}