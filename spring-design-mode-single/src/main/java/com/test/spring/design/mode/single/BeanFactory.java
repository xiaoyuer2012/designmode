package com.test.spring.design.mode.single;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/9 15:27
 */
public class BeanFactory {
    private BeanFactory() {}
    // 线程安全
    private static Map<String,Object> ioc = new ConcurrentHashMap();

    public static Object getBean(String className) {
        if(!ioc.containsKey(className)) {
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (Exception e){
                e.printStackTrace();
            }
            return obj;
        } else {
            return ioc.get(className);
        }
    }
}
