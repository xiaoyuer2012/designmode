package com.spring.test.factory.abstr;

import com.spring.test.factory.Bmw;
import com.spring.test.factory.Car;
import com.spring.test.factory.func.Factory;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/3 6:17
 */
public class BmwFactory extends AbstractFactory{

    public Car getCar() {
        return new Bmw();
    }
}
