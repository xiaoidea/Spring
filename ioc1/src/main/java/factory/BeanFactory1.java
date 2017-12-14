package factory;

import ioc1.M1Brush;

/**
 * Created by dhy on 2017/12/14.
 */
public class BeanFactory1 {
    public static M1Brush getBrush() {
        return new M1Brush();
    }
}
