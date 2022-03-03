package com.cuit.WatermelonCloud.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 自定义缓存
 */
public class CacheMapUtil {
    private volatile static Map<String, String> cacheMap;

    //<token, username>
    public Map<String, String> getMap(){
        return cacheMap;
    }

    /**
     * 单例模式
     * @return
     */
    public static Map<String, String> getInstance(){
        if(cacheMap == null){
            synchronized (CacheMapUtil.class){
                if(cacheMap == null){
                    cacheMap = new ConcurrentHashMap<>();
                }
            }
        }
        return cacheMap;
    }
}
