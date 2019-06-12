package com.test.design.mode.delegate;

import java.util.concurrent.Executor;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 6:41
 */
public class DispatcherTest {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher(new ExecutorA());
        // 看上去好像是我们的项目经理在干活
        // 但实际干活的是普通员工
        // 这就是典型，干活是我的，功劳是你的
        dispatcher.doing();
    }
}
