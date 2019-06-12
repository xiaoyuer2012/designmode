package com.test.spring.design.mode.template;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 11:32
 */
public class Coffee extends Bevegrage{
    public void pourInCup() {
        System.out.println("将咖啡倒入杯中");
    }

    public void addCoundiments() {
        System.out.println("添加牛奶和糖");
    }
}
