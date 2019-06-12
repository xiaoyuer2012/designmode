package com.spring.test.factory.abstr;

import com.spring.test.factory.Audi;
import com.spring.test.factory.Benz;
import com.spring.test.factory.Bmw;
import com.spring.test.factory.Car;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/3 6:30
 */
public abstract class AbstractFactory {
    protected abstract Car getCar();

    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new BmwFactory().getCar();
        }else if("Benz".equalsIgnoreCase(name)){
            return new BenzFactory().getCar();
        }else if("Audi".equalsIgnoreCase(name)){
            return new AudiFactory().getCar();
        }else{
            System.out.println("无效的参数");
            return null;
        }
    }
}
