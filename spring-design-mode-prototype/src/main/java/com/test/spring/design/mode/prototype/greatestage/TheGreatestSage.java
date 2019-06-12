package com.test.spring.design.mode.prototype.greatestage;

import java.io.*;
import java.util.Date;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 10:01
 */
public class TheGreatestSage extends Monkey implements Cloneable, Serializable{
    // 金箍棒
    private GoldRingedStaff staff;

    // 从石头缝里蹦出来
    public TheGreatestSage() {
        System.out.println("--------------");
        this.staff = new GoldRingedStaff();
        this.setBirthday(new Date());
        this.setHeight(150);
        this.setWeight(30);
    }

    // 分身技能
    @Override
    public Object clone() throws CloneNotSupportedException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            TheGreatestSage copy = (TheGreatestSage)ois.readObject();
            copy.setBirthday(new Date());
            return copy;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bos != null) {
                    bos.close();
                }
                if(oos != null) {
                    oos.close();
                }
                if(bis != null) {
                    bis.close();
                }
                if(ois != null) {
                    ois.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }


        return null;
    }

    public void change() {
        try {
            TheGreatestSage copySage = (TheGreatestSage)clone();
            System.out.println("大圣本尊生日是：" + this.getBirthday().getTime());
            System.out.println("大圣克隆以后的生日："+ copySage.getBirthday().getTime());
            System.out.println("大圣本尊和克隆大圣是否为同一对象："+ (this == copySage));
            System.out.println("大圣本尊和克隆大圣金箍棒是否为同一个对象：" + (this.staff == copySage.staff));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public GoldRingedStaff getStaff() {
        return staff;
    }

    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }
}
