package com.cuit.WatermelonCloud.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Filesinfo)实体类
 *
 * @author makejava
 * @since 2021-07-03 13:51:44
 */
public class FilesInfo implements Serializable {
    private static final long serialVersionUID = -20964460698343303L;
    
    private String fiId;
    
    private String fiName;
    
    private String fiExt;
    
    private Integer uiId;
    
    private Integer fiSize;
    
    private String fiHash;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date fiCreateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date fiDeleteTime;
    
    private Integer fiIsdelete;
    
    private Integer fiIsfolder;
    
    private String fiParentId;
    
    private String fiPath;


    public String getFiId() {
        return fiId;
    }

    public void setFiId(String fiId) {
        this.fiId = fiId;
    }

    public String getFiName() {
        return fiName;
    }

    public void setFiName(String fiName) {
        this.fiName = fiName;
    }

    public String getFiExt() {
        return fiExt;
    }

    public void setFiExt(String fiExt) {
        this.fiExt = fiExt;
    }

    public Integer getUiId() {
        return uiId;
    }

    public void setUiId(Integer uiId) {
        this.uiId = uiId;
    }

    public Integer getFiSize() {
        return fiSize;
    }

    public void setFiSize(Integer fiSize) {
        this.fiSize = fiSize;
    }

    public String getFiHash() {
        return fiHash;
    }

    public void setFiHash(String fiHash) {
        this.fiHash = fiHash;
    }

    public Date getFiCreateTime() {
        return fiCreateTime;
    }

    public void setFiCreateTime(Date fiCreateTime) {
        this.fiCreateTime = fiCreateTime;
    }

    public Date getFiDeleteTime() {
        return fiDeleteTime;
    }

    public void setFiDeleteTime(Date fiDeleteTime) {
        this.fiDeleteTime = fiDeleteTime;
    }

    public Integer getFiIsdelete() {
        return fiIsdelete;
    }

    public void setFiIsdelete(Integer fiIsdelete) {
        this.fiIsdelete = fiIsdelete;
    }

    public Integer getFiIsfolder() {
        return fiIsfolder;
    }

    public void setFiIsfolder(Integer fiIsfolder) {
        this.fiIsfolder = fiIsfolder;
    }

    public String getFiParentId() {
        return fiParentId;
    }

    public void setFiParentId(String fiParentId) {
        this.fiParentId = fiParentId;
    }

    public String getFiPath() {
        return fiPath;
    }

    public void setFiPath(String fiPath) {
        this.fiPath = fiPath;
    }

    @Override
    public String toString() {
        return "FilesInfo{" +
                "fiId='" + fiId + '\'' +
                ", fiName='" + fiName + '\'' +
                ", fiExt='" + fiExt + '\'' +
                ", uiId=" + uiId +
                ", fiSize=" + fiSize +
                ", fiHash='" + fiHash + '\'' +
                ", fiCreateTime=" + fiCreateTime +
                ", fiDeleteTime=" + fiDeleteTime +
                ", fiIsdelete=" + fiIsdelete +
                ", fiIsfolder=" + fiIsfolder +
                ", fiParentId='" + fiParentId + '\'' +
                ", fiPath='" + fiPath + '\'' +
                '}';
    }
}