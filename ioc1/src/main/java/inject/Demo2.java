package inject;

import config.Config;
import ioc1.M2Pen;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        M2Pen pen = context.getBean(M2Pen.class);
        pen.write();
    }
}
