package com.cuit.WatermelonCloud.service.impl;

import com.cuit.WatermelonCloud.entity.UserInfo;
import com.cuit.WatermelonCloud.mapper.IUserDao;
import com.cuit.WatermelonCloud.service.IUserService;
import com.cuit.WatermelonCloud.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author X to Y
 * @date 2021/7/4-15:19
 */

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    IUserDao userdao;

    @Override
    public UserInfo getUserByUserName(String username) {
        if(username != null && !"".equals(username)){
            return userdao.getUserByUsername(username);
        }else{
            return null;
        }
    }

    @Override
    public boolean updatePassword(String token, String newPassWord) {

        String username = BaseUtils.convertBase(token);

        return userdao.updatePassword(username, newPassWord) > 0;
    }

}
