package com.test.designmode.proxy.jdk;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/5/29 17:57
 */
public class Xiaoxingxing implements Person{
    private String sex = "女";
    private String name = "xiaoxingxing";
    public void findLove() {
        System.out.println("我叫:" + name +",性别："+ sex+",我找对象的要求是：");
        System.out.println("身高要求180cm以上，体重70kg");
        System.out.println("有房有车的");
        System.out.println("高富帅");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
