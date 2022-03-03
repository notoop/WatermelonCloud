package com.cuit.WatermelonCloud.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Resourceshare)实体类
 *
 * @author makejava
 * @since 2021-07-02 15:36:46
 */
public class ResourceShare implements Serializable {
    private static final long serialVersionUID = -86792073806130787L;
    
    private String rsId;
    
    private Integer uiId;
    
    private String rsResList;
    
    private String rsShareUrl;
    
    private Integer rsBrowseCount;
    
    private Integer rsSaveCount;
    
    private Integer rsDownloadCount;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date rsShareTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date rsExpireTime;
    
    private Integer rsShareType;
    
    private String rsShareCode;


    public String getRsId() {
        return rsId;
    }

    public void setRsId(String rsId) {
        this.rsId = rsId;
    }

    public Integer getUiId() {
        return uiId;
    }

    public void setUiId(Integer uiId) {
        this.uiId = uiId;
    }

    public String getRsResList() {
        return rsResList;
    }

    public void setRsResList(String rsResList) {
        this.rsResList = rsResList;
    }

    public String getRsShareUrl() {
        return rsShareUrl;
    }

    public void setRsShareUrl(String rsShareUrl) {
        this.rsShareUrl = rsShareUrl;
    }

    public Integer getRsBrowseCount() {
        return rsBrowseCount;
    }

    public void setRsBrowseCount(Integer rsBrowseCount) {
        this.rsBrowseCount = rsBrowseCount;
    }

    public Integer getRsSaveCount() {
        return rsSaveCount;
    }

    public void setRsSaveCount(Integer rsSaveCount) {
        this.rsSaveCount = rsSaveCount;
    }

    public Integer getRsDownloadCount() {
        return rsDownloadCount;
    }

    public void setRsDownloadCount(Integer rsDownloadCount) {
        this.rsDownloadCount = rsDownloadCount;
    }

    public Date getRsShareTime() {
        return rsShareTime;
    }

    public void setRsShareTime(Date rsShareTime) {
        this.rsShareTime = rsShareTime;
    }

    public Date getRsExpireTime() {
        return rsExpireTime;
    }

    public void setRsExpireTime(Date rsExpireTime) {
        this.rsExpireTime = rsExpireTime;
    }

    public Integer getRsShareType() {
        return rsShareType;
    }

    public void setRsShareType(Integer rsShareType) {
        this.rsShareType = rsShareType;
    }

    public String getRsShareCode() {
        return rsShareCode;
    }

    public void setRsShareCode(String rsShareCode) {
        this.rsShareCode = rsShareCode;
    }

}