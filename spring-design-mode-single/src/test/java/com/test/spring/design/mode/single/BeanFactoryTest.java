package com.test.spring.design.mode.single;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/9 15:31
 */
public class BeanFactoryTest {
    public static void main(String[] args){
        TestObj o1 = (TestObj)BeanFactory.getBean(TestObj.class.getName());
        TestObj o2 =(TestObj)BeanFactory.getBean(TestObj.class.getName());
        System.out.println(o1 == o2);
    }
}
