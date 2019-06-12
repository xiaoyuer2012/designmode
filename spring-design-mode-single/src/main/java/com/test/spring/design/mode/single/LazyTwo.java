package com.test.spring.design.mode.single;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 14:34
 */
public class LazyTwo {
    private LazyTwo() {}

    // 静态快，公共内存区域
    private static LazyTwo lazy = null;
    // synchronized 保证了线程安全，但是性能损耗大
    public static synchronized LazyTwo getInstance() {
        if(lazy == null) {
            lazy = new LazyTwo();
        }
        return lazy;
    }
}
