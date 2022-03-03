package com.cuit.WatermelonCloud.service;

import com.cuit.WatermelonCloud.entity.Menu;
import com.cuit.WatermelonCloud.entity.UserInfo;

import java.util.List;

/**
 * @author X to Y
 * @date 2021/7/3-23:44
 * 登录相关功能服务层
 */
public interface ILoginService {

    //根据用户名获取启用状态的用户
    public UserInfo getUserByUserName(String username);

    //更新用户最后登录时间
    public boolean updateLastLogin(UserInfo user);

    //根据token和菜单序号得到对应菜单列表
    public List<Menu> getMenuByToken(String token, Integer order);

    //注册新用户
    public boolean registerUser(UserInfo userInfo);
}
