package com.cuit.WatermelonCloud.exception;

import com.cuit.WatermelonCloud.utils.Msg;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: chocho
 * @Date: 2021/7/3-23:44
 * @Description: 异常拦截
 */
@RestControllerAdvice
public class ExceptionAdvice {

    @ResponseBody
    @ExceptionHandler({Exception.class, NullPointerException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Msg ServerError(){
        return Msg.fail().add("msg", "系统出错，请联系管理员");
    }

}
