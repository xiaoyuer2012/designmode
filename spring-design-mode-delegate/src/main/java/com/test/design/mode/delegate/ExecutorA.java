package com.test.design.mode.delegate;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 6:36
 */
public class ExecutorA implements IExecutor {
    public void doing() {
        System.out.println("员工A开始执行任务");
    }
}
