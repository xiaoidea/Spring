package inject;

import ioc1.M1Brush;
import ioc1.M2Pen;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dhy on 2017/12/14.
 */
public class Demo5FromFactory {
    private M1Brush brush;

    private M2Pen pen;

    public void setBrush(M1Brush brush) {
        this.brush = brush;
    }

    public void setPen(M2Pen pen) {
        this.pen = pen;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/factory.xml");
        Demo5FromFactory demo5 = context.getBean(Demo5FromFactory.class);
        demo5.brush.brush();
        demo5.pen.write();
    }
}
