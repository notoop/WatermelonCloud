package com.cuit.WatermelonCloud.controller;

import com.cuit.WatermelonCloud.entity.Menu;
import com.cuit.WatermelonCloud.entity.UserInfo;
import com.cuit.WatermelonCloud.service.impl.ILoginServiceImpl;
import com.cuit.WatermelonCloud.utils.*;
import com.cuit.WatermelonCloud.vo.LoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author X to Y
 * @date 2021/7/3-17:14
 *
 * 登录相关功能的控制类
 * 注册、登录、重置密码、注销等功能实现
 */

@RestController
public class LoginContoller {

    @Autowired
    private ILoginServiceImpl loginService;

    /***
     * 登录
     * @param loginInfo
     * @return
     */
    @PostMapping("/login")
    public Msg login(@RequestBody LoginInfo loginInfo){

        //MD5加密比对
        String Md5Pwd = MD5Utils.code(loginInfo.getUiPwd());

        UserInfo user = loginService.getUserByUserName(loginInfo.getUiUsername());

        if (user != null && user.getUiPwd() != null && user.getUiPwd() .equals(Md5Pwd)) {
            //将token信息存入缓存
            Map<String, String> map = CacheMapUtil.getInstance();
            //token 是由用户名加密后所得
            String token = BaseUtils.baseEncode(user.getUiUsername());
            //更新用户最后登录时间
            loginService.updateLastLogin(user);
            return Msg.success()
                    .add("msg", "登录成功")
                    .add("token", token)
                    .add("userName", user.getUiUsername());
        }else {
            return Msg.fail()
                    .add("msg", "账户或密码错误");
        }
    }

    /**
     * 登录后根据token值和order值获取菜单列表
     * @param response
     * @param request
     * @return
     * @throws Exception
     */
    @GetMapping("/menu")
    public Msg getMenuByToken(HttpServletResponse response,
                              HttpServletRequest request)throws Exception{

        //获取token和菜单序号
        String token = request.getHeader("token");
        Integer order = Integer.valueOf(request.getHeader("order"));

        if(token == null || "".equals(token)){
            ResponseUtil.returnErrorContent(400, response, "token发生异常");
        }
        //根据token和菜单序号得到对应菜单列表
        List<Menu> menu = loginService.getMenuByToken(token, order);

        if(menu.size() > 0){
            return Msg.success()
                    .add("msg", "菜单获取成功")
                    .add("data", menu);
        }else {
            return Msg.success()
                    .add("msg", "菜单获取失败");
        }
    }

    /**
     * 注销登录
     * @param request
     * @return
     */
    @GetMapping("/logout")
    public Msg logOut(HttpServletRequest request){
        Map<String, String> map = CacheMapUtil.getInstance();
        String token = request.getHeader("token");
        map.remove(token);

        if (map.get(token) == null || "".equals(map.get(token))) {
            return Msg.success().add("msg","成功登出");
        }else {
            return Msg.fail().add("msg","登出失败");
        }
    }

    /***
     * 注册新用户
     * @param userInfo
     * @return
     */
    @PostMapping("register")
    public Msg registerUser(@RequestBody UserInfo userInfo) {

        if(userInfo!=null){
            //md5加密密码
            String md5PWD = MD5Utils.code(userInfo.getUiPwd());
            userInfo.setUiPwd(md5PWD);

            if(loginService.registerUser(userInfo)){
                return Msg.success()
                        .add("msg","注册成功！");
            }else{
                return Msg.fail()
                        .add("msg", "注册失败！换个用户名试试！");
            }
        }else{
            return Msg.fail()
                    .add("msg", "注册失败！");
        }


    }

}
