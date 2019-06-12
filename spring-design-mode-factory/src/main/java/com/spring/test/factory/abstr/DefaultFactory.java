package com.spring.test.factory.abstr;

import com.spring.test.factory.Car;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/3 6:36
 */
public class DefaultFactory extends AbstractFactory{
    private AudiFactory factory = new AudiFactory();
    public Car getCar() {
        return factory.getCar();
    }
}
