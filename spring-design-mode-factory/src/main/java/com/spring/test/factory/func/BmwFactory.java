package com.spring.test.factory.func;

import com.spring.test.factory.Bmw;
import com.spring.test.factory.Car;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/3 6:17
 */
public class BmwFactory implements Factory{

    public Car getCar() {
        return new Bmw();
    }
}
