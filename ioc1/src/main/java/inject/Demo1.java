package inject;

import ioc1.M1Brush;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/beans.xml");
        M1Brush brush = context.getBean(M1Brush.class);
        brush.brush();
    }
}
