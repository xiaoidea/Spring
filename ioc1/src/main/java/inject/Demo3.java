package inject;

import autowire.M3Grass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/autowire.xml");
        M3Grass grass = context.getBean(M3Grass.class);
        grass.growUp();
        System.out.println(grass.getName());
    }
}
