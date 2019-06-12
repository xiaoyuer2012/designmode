package com.test.spring.design.mode.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 9:06
 */
public class ConcretePrototype implements Cloneable{
    private int age;

    private String name;

    public ArrayList<String> list = new ArrayList<String>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = null;
        concretePrototype = (ConcretePrototype)super.clone();
        concretePrototype.list = (ArrayList)list.clone();
        return concretePrototype;
    }
}
