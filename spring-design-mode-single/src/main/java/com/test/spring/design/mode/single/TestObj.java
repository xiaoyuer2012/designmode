package com.test.spring.design.mode.single;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/9 15:34
 */
public class TestObj {
    private String name;
    private String sex;
    private String address;

    @Override
    public String toString() {
        return "TestObj{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
