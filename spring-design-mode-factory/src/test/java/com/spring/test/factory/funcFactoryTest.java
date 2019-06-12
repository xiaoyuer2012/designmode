package com.spring.test.factory;

import com.spring.test.factory.func.AudiFactory;
import com.spring.test.factory.func.BmwFactory;
import com.spring.test.factory.func.Factory;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/3 6:20
 */
public class funcFactoryTest {
    public static void main(String[] args){
        // 需要用户关心，这个产品的生产商
        // 增加了代码的复杂度
        Factory factory = new AudiFactory();
        System.out.println(factory.getCar());

        factory = new BmwFactory();
        System.out.println(factory.getCar());

    }
}
