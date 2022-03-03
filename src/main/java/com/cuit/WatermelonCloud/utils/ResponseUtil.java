package com.cuit.WatermelonCloud.utils;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseUtil {
    public static void returnErrorContent(int code, HttpServletResponse response, String msg) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        response.setStatus(200);

        //业务逻辑
        ServletOutputStream out = null;
        try {
            JSONObject res = new JSONObject();
            res.put("code", code);
            res.put("msg", msg);
            out = response.getOutputStream();
            out.write(res.toString().getBytes("utf-8"));
            out.flush();
            out.close();
        } catch (IOException e) {
        }
    }
}
