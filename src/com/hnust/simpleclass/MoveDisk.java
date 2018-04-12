package com.hnust.simpleclass;

public class MoveDisk implements USB {

    @Override
    public void useUSB() {
        System.out.println("移动硬盘插入USB接口");
    }
}
