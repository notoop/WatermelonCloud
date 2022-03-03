package com.cuit.WatermelonCloud.controller;

import org.apache.ibatis.annotations.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cuit.WatermelonCloud.utils.MD5Utils;


/**
 * @author X to Y
 * @date 2021/06/30-22:22
 */
@RestController
public class test {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello World";
    }

    @RequestMapping("/testMD5")
    public String testMD5(){
        String str = "52255225";
        String password = MD5Utils.code(str);
        System.out.println(password);
        return password;
    }

}
