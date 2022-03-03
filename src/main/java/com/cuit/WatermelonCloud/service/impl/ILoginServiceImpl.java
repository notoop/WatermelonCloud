package com.cuit.WatermelonCloud.service.impl;

import com.cuit.WatermelonCloud.entity.Menu;
import com.cuit.WatermelonCloud.entity.UserInfo;
import com.cuit.WatermelonCloud.mapper.ILoginDao;
import com.cuit.WatermelonCloud.service.ILoginService;
import com.cuit.WatermelonCloud.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;

/**
 * @author X to Y
 * @date 2021/7/3-23:47
 * 登录服务层
 */
@Service
public class ILoginServiceImpl implements ILoginService {

    @Autowired
    private ILoginDao loginDao;

    @Override
    public UserInfo getUserByUserName(String username) {
        if(username != null && !"".equals(username)){
            return loginDao.getUserByUsername(username);
        }else{
            return null;
        }
    }


    @Override
    public boolean updateLastLogin(UserInfo user) {

        user.setUiLastLogin(new Date());

        return loginDao.updateLastLogin(user)>0;
    }

    @Override
    public List<Menu> getMenuByToken(String token, Integer order) {

        String username = BaseUtils.convertBase(token);

        Integer UserType = loginDao.getUserTypeByUsername(username);

//        System.out.println("UserType == " + UserType + "order == " + order);

        return loginDao.getMenuByUserOrder(UserType,order);

    }

    @Override
    public boolean registerUser(UserInfo userInfo) {
        userInfo.setUiCreateTime(new Date());

        System.out.println(userInfo.toString());

        //查看是否已存在用户
        if (loginDao.getUserByUsername2(userInfo.getUiUsername()) == null){
            return loginDao.addUser(userInfo)>0;
        }else{
            return false;
        }
    }
}
