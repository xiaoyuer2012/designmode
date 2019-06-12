package com.spring.test.factory.func;

import com.spring.test.factory.Audi;
import com.spring.test.factory.Car;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/3 6:16
 */
public class AudiFactory implements Factory{
    public Car getCar() {
        return new Audi();
    }
}
