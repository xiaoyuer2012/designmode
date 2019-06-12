package com.test.spring.design.mode.prototype.greatestage;

import java.util.Date;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 10:00
 */
public class Monkey {
    private int height;
    private int weight;
    private Date birthday; // 不是基本数据类型

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
