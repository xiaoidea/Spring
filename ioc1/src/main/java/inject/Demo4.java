package inject;

import ioc1.M4Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/param1.xml");
        M4Student student = context.getBean(M4Student.class);
        student.walk();
        student.where();
        student.when();
        student.doSth();
    }
}
