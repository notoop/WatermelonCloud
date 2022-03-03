package com.cuit.WatermelonCloud.utils;

import org.apache.tomcat.util.buf.HexUtils;

import java.util.Base64;

public class BaseUtils {
    /**
     * base64加密
     * @param content
     * @return
     */
    public static byte[] base64Encrypt(final String content) {
        return Base64.getEncoder().encode(content.getBytes());
    }

    /**
     * base64解密
     * @param encoderContent 已加密内容
     * @return byte[]
     */
    public static byte[] base64Decrypt(final byte[] encoderContent) {
        return Base64.getDecoder().decode(encoderContent);
    }

    /**
     * 加密实现访法
     * @param s
     * @return
     */
    public static String baseEncode(String s){
        byte[] base64Encrypt =  com.cuit.WatermelonCloud.utils.BaseUtils.base64Encrypt(s);
        String toHexString = HexUtils.toHexString(base64Encrypt);
        return toHexString;
    }

    /**
     * 解密实现方法
     * @param s
     * @return
     */
    public static String convertBase(String s){
        byte[] base64Encrypt = HexUtils.fromHexString(s);
//        byte[] base64Encrypt = BaseUtils.base64Encrypt("123456789");
        String toHexString = HexUtils.toHexString(base64Encrypt);//将得到得字节转换为字符串
        byte[] base64Decrypt = com.cuit.WatermelonCloud.utils.BaseUtils.base64Decrypt(base64Encrypt);
        String reslut = new String(base64Decrypt);
        return reslut;
    }

    public static void main(String[] args) {
        System.out.println(BaseUtils.baseEncode("admin"));
        //System.out.println(BaseUtils.convertBase("4d54497a"));
    }
}
