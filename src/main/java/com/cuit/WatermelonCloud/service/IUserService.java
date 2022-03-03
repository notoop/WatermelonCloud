package com.cuit.WatermelonCloud.service;

import com.cuit.WatermelonCloud.entity.UserInfo;

/**
 * @author X to Y
 * @date 2021/7/4-15:18
 * 用户相关功能服务层
 */
public interface IUserService {


    //根据用户名获取用户信息
    public UserInfo getUserByUserName(String username);

    //修改密码
    public boolean updatePassword(String token, String newPassWord);
}
