package com.cuit.WatermelonCloud.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Userinfo)实体类
 *
 * @author makejava
 * @since 2021-07-04 13:51:44
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -92234646102934733L;
    
    private Integer uiId;
    
    private String uiUsername;
    
    private String uiName;
    
    private String uiPwd;
    
    private Integer uiGender;
    
    private String uiTel;
    
    private String uiMail;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date uiCreateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date uiLastLogin;
    
    private Integer uiStatus;
    
    private Integer uiIsadmin;
    
    private String uiPortail;
    
    private Integer uiDiskMaxSize;
    
    private String uiBucketName;


    public Integer getUiId() {
        return uiId;
    }

    public void setUiId(Integer uiId) {
        this.uiId = uiId;
    }

    public String getUiUsername() {
        return uiUsername;
    }

    public void setUiUsername(String uiUsername) {
        this.uiUsername = uiUsername;
    }

    public String getUiName() {
        return uiName;
    }

    public void setUiName(String uiName) {
        this.uiName = uiName;
    }

    public String getUiPwd() {
        return uiPwd;
    }

    public void setUiPwd(String uiPwd) {
        this.uiPwd = uiPwd;
    }

    public Integer getUiGender() {
        return uiGender;
    }

    public void setUiGender(Integer uiGender) {
        this.uiGender = uiGender;
    }

    public String getUiTel() {
        return uiTel;
    }

    public void setUiTel(String uiTel) {
        this.uiTel = uiTel;
    }

    public String getUiMail() {
        return uiMail;
    }

    public void setUiMail(String uiMail) {
        this.uiMail = uiMail;
    }

    public Date getUiCreateTime() {
        return uiCreateTime;
    }

    public void setUiCreateTime(Date uiCreateTime) {
        this.uiCreateTime = uiCreateTime;
    }

    public Date getUiLastLogin() {
        return uiLastLogin;
    }

    public void setUiLastLogin(Date uiLastLogin) {
        this.uiLastLogin = uiLastLogin;
    }

    public Integer getUiStatus() {
        return uiStatus;
    }

    public void setUiStatus(Integer uiStatus) {
        this.uiStatus = uiStatus;
    }

    public Integer getUiIsadmin() {
        return uiIsadmin;
    }

    public void setUiIsadmin(Integer uiIsadmin) {
        this.uiIsadmin = uiIsadmin;
    }

    public String getUiPortail() {
        return uiPortail;
    }

    public void setUiPortail(String uiPortail) {
        this.uiPortail = uiPortail;
    }

    public Integer getUiDiskMaxSize() {
        return uiDiskMaxSize;
    }

    public void setUiDiskMaxSize(Integer uiDiskMaxSize) {
        this.uiDiskMaxSize = uiDiskMaxSize;
    }

    public String getUiBucketName() {
        return uiBucketName;
    }

    public void setUiBucketName(String uiBucketName) {
        this.uiBucketName = uiBucketName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uiId=" + uiId +
                ", uiUsername='" + uiUsername + '\'' +
                ", uiName='" + uiName + '\'' +
                ", uiPwd='" + uiPwd + '\'' +
                ", uiGender=" + uiGender +
                ", uiTel='" + uiTel + '\'' +
                ", uiMail='" + uiMail + '\'' +
                ", uiCreateTime=" + uiCreateTime +
                ", uiLastLogin=" + uiLastLogin +
                ", uiStatus=" + uiStatus +
                ", uiIsadmin=" + uiIsadmin +
                ", uiPortail='" + uiPortail + '\'' +
                ", uiDiskMaxSize=" + uiDiskMaxSize +
                ", uiBucketName='" + uiBucketName + '\'' +
                '}';
    }
}