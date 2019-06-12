package com.test.designmode.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/5/30 15:16
 * 生成代理对象的代码
 */
public class YMProxy {
    private static String ln = "\r\n";
    public static Object newProxyInstance(YMClassLoader loader,
                                          Class<?>[] interfaces,
                                          YMInvocationHandler h)
            throws IllegalArgumentException, IOException {
        // 1. 生成源代码
        String proxySrc = generateSrc(interfaces[0]);
        // 2. 将生成的源代码输出到键盘，保存为.java文件
        String filePath = YMProxy.class.getResource("").getPath();
        File f = new File(filePath + "$Proxy0.java");
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
            fw.write(proxySrc);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. 编译源代码，并且生成.class文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
        Iterable iterable = manager.getJavaFileObjects(f);

        JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
        task.call();
        manager.close();
        // 4. 将class文件中的内容，动态加载到JVM中来
        // 5. 返回被代理后的代理对象

        Constructor c = null;
        try {
            Class proxyClass = loader.findClass("$Proxy0");
            c = proxyClass.getConstructor(YMInvocationHandler.class);
            return c.newInstance(h);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return c.newInstance(h);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?> interfaces) {
        StringBuffer src = new StringBuffer();
        src.append("package com.test.designmode.proxy.custom;" + ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);
        src.append("YMInvocationHandler h;" + ln);
        src.append("public $Proxy0(YMInvocationHandler h){" + ln);
        src.append("this.h = h;" + ln);
        src.append("}" + ln);

        for(Method m : interfaces.getMethods()) {
            src.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){ " + ln);
            src.append("try{");
            src.append("Method m = "+ interfaces.getName() + ".class.getMethod(\"" + m.getName()+"\",new Class[]{});" + ln);
            src.append("this.h.invoke(this,m,null);" + ln);
            src.append("}catch(Throwable e){e.printStackTrace();}"+ln);
            src.append("}"+ln);
        }
        src.append("}");
        return src.toString();
    }
}
