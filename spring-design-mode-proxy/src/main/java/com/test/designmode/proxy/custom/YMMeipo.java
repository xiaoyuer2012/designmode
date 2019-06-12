package com.test.designmode.proxy.custom;

import java.lang.reflect.Method;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/5/30 15:19
 */
public class YMMeipo  implements YMInvocationHandler{
    private Person target;
    // 获取被代理人的个人资料
    public Object getInstance(Person target) throws Exception {
        this.target = target;
        Class clazz =target.getClass();
        System.out.println("被代理对象的class是：" + clazz);
        return YMProxy.newProxyInstance(new YMClassLoader(),clazz.getInterfaces(),this);
        //return null;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆：得给您找个异性才行");
        System.out.println("开始进行海选.....");
        System.out.println("-------------");
        method.invoke(this.target, args);
        System.out.println("-----------");
        System.out.println("如果合适的话，就准备办事");
        return null;
    }
}
