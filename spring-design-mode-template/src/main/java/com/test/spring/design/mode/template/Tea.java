package com.test.spring.design.mode.template;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 12:24
 */
public class Tea extends Bevegrage{
    public void pourInCup() {
        System.out.println("将茶叶放入杯中");
    }

    public void addCoundiments() {
        System.out.println("添加蜂蜜");
    }
}
