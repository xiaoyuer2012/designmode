package com.spring.test.factory;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/2 6:56
 */
public class SimpleFactory {
    // 实现统一管理、专业化管理
    // 如果没有工厂模式，小作坊，没有执行标准
    // 如果买到三无产品（没有标准）
    public Car getCar(String name) {
        // Spring中的工厂模式
        // Bean
        // BeanFactory (生成Bean)
        // 单例的Bean
        // 被代理过的Bean
        // 最原始的Bean(原型)
        // List类型中的Bean
        // 作用域不同的Bean

        // getBean
        // 简单工厂实现，非常的为紊乱，维护困难
        // 解耦(松耦合开发)
        if("BMW".equalsIgnoreCase(name)){
            return new Bmw();
        }else if("Benz".equalsIgnoreCase(name)){
            return new Benz();
        }else if("Audi".equalsIgnoreCase(name)){
            return new Audi();
        }else{
            System.out.println("无效的参数");
            return null;
        }

    }
}
