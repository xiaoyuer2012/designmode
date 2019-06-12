package com.test.spring.design.mode.prototype.greatestage;

import java.io.Serializable;

/**
 * @Author: yaoyanmeia
 * @Date: 2019/6/5 10:00
 */
public class GoldRingedStaff implements Serializable{
    private float height = 100;
    private float diameter = 10;

    public void grow() {
        this.height *= 2;
        this.diameter *= 2;
    }

    public void shrink() {
        this.diameter /= 2;
        this.height /= 2;
    }
}
