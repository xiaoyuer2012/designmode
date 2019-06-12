package com.spring.test.factory.func;

import com.spring.test.factory.Benz;
import com.spring.test.factory.Car;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/3 6:17
 */
public class BenzFactory implements Factory{

    public Car getCar() {
        return new Benz();
    }
}
