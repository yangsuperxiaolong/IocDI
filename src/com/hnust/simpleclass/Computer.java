
package com.hnust.simpleclass;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Scope("prototype")
public class Computer {
    //定义USB接口变量
    @Resource
   private USB usb;
    //设值注入方式
   // public void setUsb(USB usb) {
     //   this.usb = usb;
  //  }
    /*
    //构造注入方式
    public Computer(USB usb){
        this.usb= usb;
    }
    */
    public void readData(){
        usb.useUSB();
        System.out.println("计算机读取数据....");
    }
}