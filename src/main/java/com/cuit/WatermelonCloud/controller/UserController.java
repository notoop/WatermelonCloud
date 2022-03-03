package com.cuit.WatermelonCloud.controller;

import com.cuit.WatermelonCloud.entity.UserInfo;
import com.cuit.WatermelonCloud.service.IUserService;
import com.cuit.WatermelonCloud.service.impl.IUserServiceImpl;
import com.cuit.WatermelonCloud.utils.BaseUtils;
import com.cuit.WatermelonCloud.utils.MD5Utils;
import com.cuit.WatermelonCloud.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author X to Y
 * @date 2021/7/4-15:17
 * 用户相关功能控制类
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserServiceImpl userService;



    /***
     * 修改密码
     * @param request
     * @param oldPassWord
     * @param newPassWord
     * @return
     */
    @GetMapping("updatepwd")
    public Msg updatePassword(HttpServletRequest request,
                              @RequestParam String oldPassWord,
                              @RequestParam String newPassWord){

        String token = request.getHeader("token");
        String md5OldPassWord = MD5Utils.code(oldPassWord);
        String md5NewPassWord = MD5Utils.code(newPassWord);

        //用户校验
        UserInfo user = userService.getUserByUserName(BaseUtils.convertBase(token));
        if(user != null){
            if(!user.getUiPwd().equals(md5OldPassWord)){
                return Msg.fail()
                        .add("msg", "旧密码输入错误");
            }else {
                if (userService.updatePassword(token, md5NewPassWord)) {
                    return Msg.success()
                            .add("msg", "修改密码成功");
                } else {
                    return Msg.fail()
                            .add("msg", "修改密码失败");
                }
            }
        }else{
            return Msg.fail()
                    .add("msg", "修改密码失败！");
        }
    }

}
