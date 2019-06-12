package com.test.designmode.test;

import com.test.designmode.proxy.custom.Xiaohong;
import com.test.designmode.proxy.custom.YMMeipo;
import com.test.designmode.proxy.jdk.Meipo;
import com.test.designmode.proxy.custom.Person;
import com.test.designmode.proxy.jdk.Xiaoxingxing;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/5/29 18:02
 */
public class TestApplication {
    public static  void main(String[] args) {
        // 直接调用
        // new Xiaoxingxing().findLove();
        // 通过jdk代理实现
        try {
            Person obj = (Person)new Meipo().getInstance(new Xiaoxingxing());
            System.out.println(obj.getClass());
            obj.findLove();

            //原理
            //1. 拿到被代理对象的引用，然后获取他的接口
            //2. JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
            //3. 把被代理对象的引用也拿到了
            //4. 重新动态生成一个class字节码
            //5. 然后编译

            // 获取字节码内容
            byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{obj.getClass()});
            FileOutputStream os = new FileOutputStream("$Proxy0.class");
            os.write(data);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public static  void main(String[] args) {
//        // 直接调用
//        // new Xiaoxingxing().findLove();
//        // 通过jdk代理实现
//        try {
//            Person obj =(Person)new YMMeipo().getInstance(new Xiaohong());
//            System.out.println(obj.getClass());
//            obj.findLove();
//
//            //原理
//            //1. 拿到被代理对象的引用，然后获取他的接口
//            //2. JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
//            //3. 把被代理对象的引用也拿到了
//            //4. 重新动态生成一个class字节码
//            //5. 然后编译
//
//            // 获取字节码内容
//    //        byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{obj.getClass()});
//    //        FileOutputStream os = new FileOutputStream("$Proxy0.class");
//    //        os.write(data);
//    //        os.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
