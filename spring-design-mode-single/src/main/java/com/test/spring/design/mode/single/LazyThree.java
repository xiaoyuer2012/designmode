package com.test.spring.design.mode.single;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/9 15:15
 */
public class LazyThree {
    private boolean initialized = false;

    // 默认使用LazyThree的时候，会先初始化内部类
    // 如果没使用的话，内部类是不加载的
    private LazyThree() {
        synchronized (LazyThree.class) {
            if(initialized == false) {
                initialized = !initialized;
            } else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    // 每一个关键字都不是多余的
    // static是为了使单例的空间共享
    // 保证这个方法不会被重写，重载
    public static final LazyThree getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyThree LAZY = new LazyThree();
    }
}
