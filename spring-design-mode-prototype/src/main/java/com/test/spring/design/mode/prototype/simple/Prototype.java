package com.test.spring.design.mode.prototype.simple;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 9:06
 */
public class Prototype implements Cloneable{
    public ArrayList<String> list = new ArrayList<String>();
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = null;
        prototype = (Prototype)super.clone();
        prototype.list = (ArrayList)list.clone();
        return prototype;
    }
}
