package com.spring.test.factory;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/2 6:57
 */
public class SimpleFactoryTest {
    public static void main(String[] args){
        Car car = new SimpleFactory().getCar("BMW");
        System.out.println(car.getName());
    }
}
