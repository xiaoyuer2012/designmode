package com.test.designmode.proxy.custom;

import java.lang.reflect.Method;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/5/30 15:15
 */
public interface YMInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
