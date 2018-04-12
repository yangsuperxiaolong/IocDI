package com.hnust.simpleclass;

import org.springframework.stereotype.Component;

@Component
public class UDisk implements USB {

    @Override
    public void useUSB() {
        System.out.println("U盘插入USB接口");
    }
}
