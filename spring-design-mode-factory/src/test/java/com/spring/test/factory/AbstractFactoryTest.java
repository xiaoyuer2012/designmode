package com.spring.test.factory;

import com.spring.test.factory.abstr.AbstractFactory;
import com.spring.test.factory.abstr.DefaultFactory;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/3 6:34
 */
public class AbstractFactoryTest {
    public static void main(String[] args){
        DefaultFactory factory = new DefaultFactory();
        System.out.println(factory.getCar());

        System.out.println(factory.getCar("Benz"));

        // 设计模式的经典之处，在于解决了编写代码的人和调用代码的人双方的痛处
        // 解放我们的双手
    }
}
