package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import point.Performance;

/**
 * Created by dhy on 2017/12/24.
 */
public class AopDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop1.xml");
        Performance p = context.getBean(Performance.class);
        //p.perform();
        try {
            p.performThrow();
        } catch (Exception e){
            System.out.println("---");
        }
    }
}
