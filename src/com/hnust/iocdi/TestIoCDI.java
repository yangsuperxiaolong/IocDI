package com.hnust.iocdi;
import com.hnust.simpleclass.Computer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoCDI {

   @Test
    public void test1(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("spring-config.xml");
        Computer cp =atc.getBean("computer",Computer.class);
        Computer cp1=atc.getBean("computer",Computer.class);
        //cp.readData();
       System.out.println(cp==cp1);
    }
}
