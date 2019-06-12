package com.spring.test.factory.abstr;

import com.spring.test.factory.Audi;
import com.spring.test.factory.Car;
import com.spring.test.factory.func.Factory;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/3 6:16
 */
public class AudiFactory extends AbstractFactory{
    public Car getCar() {
        return new Audi();
    }
}
