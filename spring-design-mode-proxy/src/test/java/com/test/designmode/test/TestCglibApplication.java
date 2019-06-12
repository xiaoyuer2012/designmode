package com.test.designmode.test;

import com.test.designmode.proxy.cglib.YMMeipo;
import com.test.designmode.proxy.cglib.Zhangsan;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/1 20:30
 */
public class TestCglibApplication {
    public static void main(String[] args) {
        // JDK动态代理是通过接口来进行强制转换的
        // 生成以后的代理对象，可以强制转换为接口

        // CGLib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
        // 生成以后的对象，可以强制转换为被代理对象（也就是用自己写的类）
        // 子类引用赋值给父类
        try {
            Zhangsan obj = (Zhangsan)new YMMeipo().getInstance(Zhangsan.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
