package com.test.spring.design.mode.template;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 11:00
 * 冲饮料（拿出去卖钱了）
 */
public abstract class Bevegrage {
    // 不能被重写
    public final void create() {
        // 1、把水烧开
        boilWater();
        // 2、把杯子准备好、原材料放到杯子中
        pourInCup();
        // 3、用水冲泡
        brew();
        // 4、加辅料
        addCoundiments();
    }

    public abstract void pourInCup();

    public void boilWater(){
        System.out.println("烧开水，烧到100度可以起锅了");
    }

    public void brew() {
        System.out.println("将开水倒入杯中进行冲泡");
    }
    public abstract void addCoundiments();
}
