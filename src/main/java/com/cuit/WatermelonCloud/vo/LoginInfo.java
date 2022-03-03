package com.cuit.WatermelonCloud.vo;

/**
 * @author X to Y
 * @date 2021/7/3-17:26
 *
 * 登录信息实体类
 */
public class LoginInfo {
    String uiUsername;
    String uiPwd;

    public String getUiUsername() {
        return uiUsername;
    }

    public void setUiUsername(String uiUsername) {
        this.uiUsername = uiUsername;
    }

    public String getUiPwd() {
        return uiPwd;
    }

    public void setUiPwd(String uiPwd) {
        this.uiPwd = uiPwd;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "uiName='" + uiUsername + '\'' +
                ", uiPwd='" + uiPwd + '\'' +
                '}';
    }
}
