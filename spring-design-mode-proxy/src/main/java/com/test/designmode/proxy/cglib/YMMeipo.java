package com.test.designmode.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/5/31 6:29
 */
public class YMMeipo implements MethodInterceptor {

    public Object getInstance(Class clazz) throws Exception {
        // 通过反射机制，给他实例化
        Enhancer enhancer = new Enhancer();
        // 把父类设置为谁
        // 这一步就是告诉cglib，生成的子类需要继承哪个类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        // 第一步 生成源代码
        // 第二步 编译成class文件
        // 第三步 加载到jvm中，并返回被代理对象
        return enhancer.create();

    }
    // 同样是做了字节码重组这样一件事
    // 对于使用API的用户来说，无感知
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是媒婆：得给您找个异性才行");
        System.out.println("开始进行海选.....");
        System.out.println("-------------");
        // 这个object的引用是由cglib给我们new出来的
        //cglib new 出来以后的对象，是被代理对象的子类(继承了我们自己写的类)
        //oop，在new子类之前，实际上默认先调用了我们super()方法的
        // new子类的同时，必须先new出来父类，这就相当于是间接的持有了我们父类的引用
        //子类重写了父类的所有的方法
        //我们改变子类对象的某些属性，是可以间接的操作到父类的属性的
        methodProxy.invokeSuper(obj, objects);
        System.out.println("-----------");
        System.out.println("如果合适的话，就准备办事");
        return null;
    }
}
